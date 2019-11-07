package io.github.jswart.scryfallfluentapi.query.catalogs.planeswalkertypes;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.github.jswart.scryfallfluentapi.query.ScryFallApiConstants;
import io.github.jswart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class CatalogPlaneswalkerTypesImpl implements CatalogPlaneswalkerTypesInf {

  private final CatalogPlaneswalkerTypesFormatInf formatInst;

  private CatalogPlaneswalkerTypesFormatEnum format = CatalogPlaneswalkerTypesFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public CatalogPlaneswalkerTypesImpl() {
    formatInst = new CatalogPlaneswalkerTypesFormatImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/catalog/planeswalker-types%s%s", ScryFallApiConstants.BASE_API_URL,
        question, options);
    return urlStr;
  }

  public URL buildUrl() {
    final List<String> urlOptions = from();
    final String urlStr = formatEndpointUrlAsString(urlOptions);
    return UrlUtil.createUrl(urlStr);
  }

  public URL buildVerboseUrl() {
    final List<String> urlOptions = fromVerbose();
    final String urlStr = formatEndpointUrlAsString(urlOptions);
    return UrlUtil.createUrl(urlStr);
  }

  public String build() {
    final List<String> urlOptions = from();
    final String urlStr = formatEndpointUrlAsString(urlOptions);
    return urlStr;
  }

  public String buildVerbose() {
    final List<String> urlOptions = fromVerbose();
    final String urlStr = formatEndpointUrlAsString(urlOptions);
    return urlStr;
  }

  /* Client options */
  public CatalogPlaneswalkerTypesFormatInf withFormat() {
    return formatInst;
  }

  public CatalogPlaneswalkerTypesInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CatalogPlaneswalkerTypesFormatEnum format) {
    this.format = format;
  }

  private List<String> fromVerbose() {

    final List<String> params = new ArrayList<String>();
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    final List<String> params = new ArrayList<String>();
    if (format != CatalogPlaneswalkerTypesFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

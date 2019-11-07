package com.swart.scryfallfluentapi.query.catalogs.toughness;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallfluentapi.query.ScryFallApiConstants;
import com.swart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class CatalogToughnessImpl implements CatalogToughnessInf {

  private final CatalogToughnessFormatInf formatInst;

  private CatalogToughnessFormatEnum format = CatalogToughnessFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public CatalogToughnessImpl() {
    formatInst = new CatalogToughnessFormatImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/catalog/toughness%s%s", ScryFallApiConstants.BASE_API_URL, question,
        options);
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
  public CatalogToughnessFormatInf withFormat() {
    return formatInst;
  }

  public CatalogToughnessInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CatalogToughnessFormatEnum format) {
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
    if (format != CatalogToughnessFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

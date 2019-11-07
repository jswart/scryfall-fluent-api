package com.swart.scryfallfluentapi.query.symbology;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallfluentapi.query.ScryFallApiConstants;
import com.swart.scryfallfluentapi.query.symbology.parsemana.SymbologyParseManaImpl;
import com.swart.scryfallfluentapi.query.symbology.parsemana.SymbologyParseManaInf;
import com.swart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class SymbologyImpl implements SymbologyInf {

  public SymbologyParseManaInf parsemana() {
    return new SymbologyParseManaImpl();
  }

  private final SymbologyFormatInf formatInst;

  private SymbologyFormatEnum format = SymbologyFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public SymbologyImpl() {
    formatInst = new SymbologyFormatImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/symbology%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
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
  public SymbologyInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final SymbologyFormatEnum format) {
    this.format = format;
  }

  public SymbologyFormatInf withFormat() {
    return formatInst;
  }

  private List<String> fromVerbose() {

    final List<String> params = new ArrayList<String>();
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    final List<String> params = new ArrayList<String>();
    if (format != SymbologyFormatEnum.JSON) {
      params.add(String.format("format=%s", this.format.toString()));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

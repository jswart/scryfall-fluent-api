package io.github.jswart.scryfallfluentapi.query.symbology.parsemana;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.github.jswart.scryfallfluentapi.query.ScryFallApiConstants;
import io.github.jswart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class SymbologyParseManaImpl implements SymbologyParseManaInf {

  private final SymbologyParseManaFormatInf formatInst;

  private String cost = null;
  private SymbologyParseManaFormatEnum format = SymbologyParseManaFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public SymbologyParseManaImpl() {
    formatInst = new SymbologyParseManaFormatImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/symbology/parse-mana%s%s", ScryFallApiConstants.BASE_API_URL, question,
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
  public SymbologyParseManaFormatInf withFormat() {
    return formatInst;
  }

  public SymbologyParseManaInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public SymbologyParseManaInf withCost(final String cost) {
    this.cost = cost;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final SymbologyParseManaFormatEnum format) {
    this.format = format;
  }

  private List<String> fromVerbose() {

    if (cost == null) {
      throw new IllegalArgumentException("The cost must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    params.add(String.format("cost=%s", this.cost));
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    if (cost == null) {
      throw new IllegalArgumentException("The cost must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    params.add(String.format("cost=%s", this.cost));
    if (format != SymbologyParseManaFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

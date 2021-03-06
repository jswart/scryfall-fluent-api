package io.github.jswart.scryfallfluentapi.query.sets.id;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.github.jswart.scryfallfluentapi.query.ScryFallApiConstants;
import io.github.jswart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class SetsIdImpl implements SetsIdInf {

  private final SetsIdFormatInf formatInst;

  private String id = null;
  private SetsIdFormatEnum format = SetsIdFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public SetsIdImpl() {
    formatInst = new SetsIdFormatImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/sets/%s%s%s", ScryFallApiConstants.BASE_API_URL, id, question, options);
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
  public SetsIdFormatInf withFormat() {
    return formatInst;
  }

  public SetsIdInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public SetsIdInf withId(final String uuid) {
    this.id = uuid;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final SetsIdFormatEnum format) {
    this.format = format;
  }

  private List<String> fromVerbose() {

    if (id == null) {
      throw new IllegalArgumentException("The id must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    if (id == null) {
      throw new IllegalArgumentException("The id must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    if (format != SetsIdFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

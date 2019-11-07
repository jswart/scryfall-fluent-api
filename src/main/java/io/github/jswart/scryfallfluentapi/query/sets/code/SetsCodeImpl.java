package io.github.jswart.scryfallfluentapi.query.sets.code;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.github.jswart.scryfallfluentapi.model.SetDBEnum;
import io.github.jswart.scryfallfluentapi.query.ScryFallApiConstants;
import io.github.jswart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class SetsCodeImpl implements SetsCodeInf {

  private final SetsCodeFormatInf formatInst;

  private SetDBEnum set = null;
  private SetsCodeFormatEnum format = SetsCodeFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public SetsCodeImpl() {
    formatInst = new SetsCodeFormatImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/sets/%s%s%s", ScryFallApiConstants.BASE_API_URL, set.toString(), question,
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
  public SetsCodeInf withSet(final SetDBEnum set) {
    this.set = set;
    return this;
  }

  public SetsCodeFormatInf withFormat() {
    return formatInst;
  }

  public SetsCodeInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public void setSet(final SetDBEnum set) {
    this.set = set;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final SetsCodeFormatEnum format) {
    this.format = format;
  }

  private List<String> fromVerbose() {

    if (set == null) {
      throw new IllegalArgumentException("A three to five letter set code must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    if (set == null) {
      throw new IllegalArgumentException("A three to five letter set code must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    if (format != SetsCodeFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

package com.swart.scryfallapiV2.query.sets.tcgplayerid;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallapiV2.query.ScryFallApiConstants;
import com.swart.scryfallapiV2.util.UrlUtil;

/**
 * @author jake swart
 */
public class SetsTcgplayerIdImpl implements SetsTcgplayerIdInf {

  private final SetsTcgplayerIdFormatInf formatInst;

  private Integer id = null;
  private SetsTcgplayerIdFormatEnum format = SetsTcgplayerIdFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public SetsTcgplayerIdImpl() {
    formatInst = new SetsTcgplayerIdFormatImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/sets/tcgplayer/%s%s%s", ScryFallApiConstants.BASE_API_URL, id, question,
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
  public SetsTcgplayerIdFormatInf withFormat() {
    return formatInst;
  }

  public SetsTcgplayerIdInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public SetsTcgplayerIdInf withId(final int id) {
    this.id = id;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final SetsTcgplayerIdFormatEnum format) {
    this.format = format;
  }

  private List<String> fromVerbose() {

    if (id == null) {
      throw new IllegalArgumentException("The id must be defined.");
    }
    if (id < 1) {
      throw new IllegalArgumentException("The id must be greater than 1.");
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
    if (id < 1) {
      throw new IllegalArgumentException("The id must be greater than 1.");
    }

    final List<String> params = new ArrayList<String>();
    if (format != SetsTcgplayerIdFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

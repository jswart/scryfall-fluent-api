package com.swart.scryfallfluentapi.query.sets;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallfluentapi.query.ScryFallApiConstants;
import com.swart.scryfallfluentapi.query.sets.code.SetsCodeImpl;
import com.swart.scryfallfluentapi.query.sets.code.SetsCodeInf;
import com.swart.scryfallfluentapi.query.sets.id.SetsIdImpl;
import com.swart.scryfallfluentapi.query.sets.id.SetsIdInf;
import com.swart.scryfallfluentapi.query.sets.tcgplayerid.SetsTcgplayerIdImpl;
import com.swart.scryfallfluentapi.query.sets.tcgplayerid.SetsTcgplayerIdInf;
import com.swart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class SetsImpl implements SetsInf {

  public SetsCodeInf code() {
    return new SetsCodeImpl();
  }

  public SetsTcgplayerIdInf tcgplayerId() {
    return new SetsTcgplayerIdImpl();
  }

  public SetsIdInf id() {
    return new SetsIdImpl();
  }

  private final SetsFormatInf formatInst;

  private SetsFormatEnum format = SetsFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public SetsImpl() {
    formatInst = new SetsFormatImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/sets%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
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
  public SetsInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final SetsFormatEnum format) {
    this.format = format;
  }

  public SetsFormatInf withFormat() {
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
    if (format != SetsFormatEnum.JSON) {
      params.add(String.format("format=%s", this.format.toString()));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

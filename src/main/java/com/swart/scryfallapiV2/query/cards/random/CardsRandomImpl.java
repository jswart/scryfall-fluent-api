package com.swart.scryfallapiV2.query.cards.random;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallapiV2.query.ScryFallApiConstants;
import com.swart.scryfallapiV2.util.UrlUtil;

public class CardsRandomImpl implements CardsRandomInf {

  private String query = "";
  private final CardsRandomFormatInf formatInst;
  private final CardsRandomFaceInf faceInst;
  private final CardsRandomVersionInf versionInst;

  private CardsRandomFormatEnum format = CardsRandomFormatEnum.JSON;
  private CardsRandomFaceEnum face = CardsRandomFaceEnum.FRONT;
  private CardsRandomVersionEnum version = CardsRandomVersionEnum.LARGE;
  private Boolean pretty = Boolean.FALSE;

  public CardsRandomImpl() {
    formatInst = new CardsRandomFormatImpl(this);
    faceInst = new CardsRandomFaceImpl(this);
    versionInst = new CardsRandomVersionImpl(this);
  }

  public URL buildUrl() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/random%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public URL buildVerboseUrl() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/random%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public String build() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/random%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    return urlStr;
  }

  public String buildVerbose() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/random%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    return urlStr;
  }

  /* Client options */
  public CardsRandomInf withQuery(final String query) {
    if (query != null) {
      this.query = query;
    }
    return this;
  }

  public CardsRandomFormatInf withFormat() {
    return formatInst;
  }

  public CardsRandomFaceInf withFace() {
    return faceInst;
  }

  public CardsRandomVersionInf withVersion() {
    return versionInst;
  }

  public CardsRandomInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsRandomFormatEnum format) {
    this.format = format;
  }

  public void setFace(final CardsRandomFaceEnum face) {
    this.face = face;
  }

  public void setVersion(final CardsRandomVersionEnum version) {
    this.version = version;
  }

  private List<String> fromVerbose() {

    if (query.isEmpty()) {
      throw new IllegalArgumentException("Query must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    if (!query.isEmpty()) {
      params.add(String.format("q=%s", UrlUtil.urlEncodeString(query)));
    }
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("face=%s", this.face.toString()));
    params.add(String.format("version=%s", this.version.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    if (query.isEmpty()) {
      throw new IllegalArgumentException("Query must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    if (!query.isEmpty()) {
      params.add(String.format("q=%s", UrlUtil.urlEncodeString(query)));
    }
    if (format != CardsRandomFormatEnum.JSON) {
      params.add(String.format("format=%s", this.format.toString()));
    }
    if (face != CardsRandomFaceEnum.FRONT) {
      params.add(String.format("face=%s", face));
    }
    if (version != CardsRandomVersionEnum.LARGE) {
      params.add(String.format("version=%s", version));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

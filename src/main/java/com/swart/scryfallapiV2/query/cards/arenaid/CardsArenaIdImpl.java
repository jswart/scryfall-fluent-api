package com.swart.scryfallapiV2.query.cards.arenaid;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallapiV2.query.ScryFallApiConstants;
import com.swart.scryfallapiV2.util.UrlUtil;

/**
 * @author jake swart
 */
public class CardsArenaIdImpl implements CardsArenaIdInf {

  private final CardsArenaIdFormatInf formatInst;
  private final CardsArenaIdFaceInf faceInst;
  private final CardsArenaIdVersionInf versionInst;

  private Integer id = null;
  private CardsArenaIdFormatEnum format = CardsArenaIdFormatEnum.JSON;
  private CardsArenaIdFaceEnum face = CardsArenaIdFaceEnum.FRONT;
  private CardsArenaIdVersionEnum version = CardsArenaIdVersionEnum.LARGE;
  private Boolean pretty = Boolean.FALSE;

  public CardsArenaIdImpl() {
    formatInst = new CardsArenaIdFormatImpl(this);
    faceInst = new CardsArenaIdFaceImpl(this);
    versionInst = new CardsArenaIdVersionImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/arena/%s%s%s", ScryFallApiConstants.BASE_API_URL, id, question,
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
  public CardsArenaIdFormatInf withFormat() {
    return formatInst;
  }

  public CardsArenaIdFaceInf withFace() {
    return faceInst;
  }

  public CardsArenaIdVersionInf withVersion() {
    return versionInst;
  }

  public CardsArenaIdInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public CardsArenaIdInf withId(final int id) {
    this.id = id;
    return this;
  }

  public void setFace(final CardsArenaIdFaceEnum face) {
    this.face = face;
  }

  public void setVersion(final CardsArenaIdVersionEnum version) {
    this.version = version;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsArenaIdFormatEnum format) {
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
    params.add(String.format("face=%s", this.face.toString()));
    params.add(String.format("version=%s", this.version.toString()));
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
    if (format != CardsArenaIdFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (face != CardsArenaIdFaceEnum.FRONT) {
      params.add(String.format("face=%s", face));
    }
    if (version != CardsArenaIdVersionEnum.LARGE) {
      params.add(String.format("version=%s", version));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

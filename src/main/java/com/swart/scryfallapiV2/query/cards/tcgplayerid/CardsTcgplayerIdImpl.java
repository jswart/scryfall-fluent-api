package com.swart.scryfallapiV2.query.cards.tcgplayerid;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallapiV2.query.ScryFallApiConstants;
import com.swart.scryfallapiV2.util.UrlUtil;

/**
 * @author jake swart
 */
public class CardsTcgplayerIdImpl implements CardsTcgplayerIdInf {

  private final CardsTcgplayerIdFormatInf formatInst;
  private final CardsTcgplayerIdFaceInf faceInst;
  private final CardsTcgplayerIdVersionInf versionInst;

  private Integer id = null;
  private CardsTcgplayerIdFormatEnum format = CardsTcgplayerIdFormatEnum.JSON;
  private CardsTcgplayerIdFaceEnum face = CardsTcgplayerIdFaceEnum.FRONT;
  private CardsTcgplayerIdVersionEnum version = CardsTcgplayerIdVersionEnum.LARGE;
  private Boolean pretty = Boolean.FALSE;

  public CardsTcgplayerIdImpl() {
    formatInst = new CardsTcgplayerIdFormatImpl(this);
    faceInst = new CardsTcgplayerIdFaceImpl(this);
    versionInst = new CardsTcgplayerIdVersionImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/tcgplayer/%s%s%s", ScryFallApiConstants.BASE_API_URL, id, question,
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
  public CardsTcgplayerIdFormatInf withFormat() {
    return formatInst;
  }

  public CardsTcgplayerIdFaceInf withFace() {
    return faceInst;
  }

  public CardsTcgplayerIdVersionInf withVersion() {
    return versionInst;
  }

  public CardsTcgplayerIdInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public CardsTcgplayerIdInf withId(final int id) {
    this.id = id;
    return this;
  }

  public void setFace(final CardsTcgplayerIdFaceEnum face) {
    this.face = face;
  }

  public void setVersion(final CardsTcgplayerIdVersionEnum version) {
    this.version = version;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsTcgplayerIdFormatEnum format) {
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
    if (format != CardsTcgplayerIdFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (face != CardsTcgplayerIdFaceEnum.FRONT) {
      params.add(String.format("face=%s", face));
    }
    if (version != CardsTcgplayerIdVersionEnum.LARGE) {
      params.add(String.format("version=%s", version));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

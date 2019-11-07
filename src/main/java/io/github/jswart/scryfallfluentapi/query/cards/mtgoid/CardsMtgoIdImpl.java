package io.github.jswart.scryfallfluentapi.query.cards.mtgoid;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.github.jswart.scryfallfluentapi.query.ScryFallApiConstants;
import io.github.jswart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class CardsMtgoIdImpl implements CardsMtgoIdInf {

  private final CardsMtgoIdFormatInf formatInst;
  private final CardsMtgoIdFaceInf faceInst;
  private final CardsMtgoIdVersionInf versionInst;

  private Integer id = null;
  private CardsMtgoIdFormatEnum format = CardsMtgoIdFormatEnum.JSON;
  private CardsMtgoIdFaceEnum face = CardsMtgoIdFaceEnum.FRONT;
  private CardsMtgoIdVersionEnum version = CardsMtgoIdVersionEnum.LARGE;
  private Boolean pretty = Boolean.FALSE;
  private Boolean rulings = Boolean.FALSE;

  public CardsMtgoIdImpl() {
    formatInst = new CardsMtgoIdFormatImpl(this);
    faceInst = new CardsMtgoIdFaceImpl(this);
    versionInst = new CardsMtgoIdVersionImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String rulingsPath = (rulings) ? "/rulings" : "";
    final String urlStr = String.format("%s/cards/mtgo/%s%s%s%s", ScryFallApiConstants.BASE_API_URL, id, rulingsPath,
        question, options);
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
  public CardsMtgoIdInf withRulings() {
    this.rulings = Boolean.TRUE;
    return this;
  }

  public CardsMtgoIdFormatInf withFormat() {
    return formatInst;
  }

  public CardsMtgoIdFaceInf withFace() {
    return faceInst;
  }

  public CardsMtgoIdVersionInf withVersion() {
    return versionInst;
  }

  public CardsMtgoIdInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public CardsMtgoIdInf withId(final int id) {
    this.id = id;
    return this;
  }

  public void setFace(final CardsMtgoIdFaceEnum face) {
    this.face = face;
  }

  public void setVersion(final CardsMtgoIdVersionEnum version) {
    this.version = version;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsMtgoIdFormatEnum format) {
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
    if (format != CardsMtgoIdFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (face != CardsMtgoIdFaceEnum.FRONT) {
      params.add(String.format("face=%s", face));
    }
    if (version != CardsMtgoIdVersionEnum.LARGE) {
      params.add(String.format("version=%s", version));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

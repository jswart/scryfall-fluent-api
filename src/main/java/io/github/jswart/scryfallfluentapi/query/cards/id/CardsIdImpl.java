package io.github.jswart.scryfallfluentapi.query.cards.id;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.github.jswart.scryfallfluentapi.query.ScryFallApiConstants;
import io.github.jswart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class CardsIdImpl implements CardsIdInf {

  private final CardsIdFormatInf formatInst;
  private final CardsIdFaceInf faceInst;
  private final CardsIdVersionInf versionInst;

  private String id = null;
  private CardsIdFormatEnum format = CardsIdFormatEnum.JSON;
  private CardsIdFaceEnum face = CardsIdFaceEnum.FRONT;
  private CardsIdVersionEnum version = CardsIdVersionEnum.LARGE;
  private Boolean pretty = Boolean.FALSE;
  private Boolean rulings = Boolean.FALSE;

  public CardsIdImpl() {
    formatInst = new CardsIdFormatImpl(this);
    faceInst = new CardsIdFaceImpl(this);
    versionInst = new CardsIdVersionImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String rulingsPath = (rulings) ? "/rulings" : "";
    final String urlStr = String.format("%s/cards/%s%s%s%s", ScryFallApiConstants.BASE_API_URL, id, rulingsPath,
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
  public CardsIdInf withRulings() {
    this.rulings = Boolean.TRUE;
    return this;
  }

  public CardsIdFormatInf withFormat() {
    return formatInst;
  }

  public CardsIdFaceInf withFace() {
    return faceInst;
  }

  public CardsIdVersionInf withVersion() {
    return versionInst;
  }

  public CardsIdInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public CardsIdInf withId(final String uuid) {
    this.id = uuid;
    return this;
  }

  public void setFace(final CardsIdFaceEnum face) {
    this.face = face;
  }

  public void setVersion(final CardsIdVersionEnum version) {
    this.version = version;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsIdFormatEnum format) {
    this.format = format;
  }

  private List<String> fromVerbose() {

    if (id == null) {
      throw new IllegalArgumentException("The id must be defined.");
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

    final List<String> params = new ArrayList<String>();
    if (format != CardsIdFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (face != CardsIdFaceEnum.FRONT) {
      params.add(String.format("face=%s", face));
    }
    if (version != CardsIdVersionEnum.LARGE) {
      params.add(String.format("version=%s", version));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

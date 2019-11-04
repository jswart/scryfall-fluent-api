package com.swart.scryfallapiV2.query.cards.codenumber;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallapiV2.model.SetDBEnum;
import com.swart.scryfallapiV2.query.ScryFallApiConstants;
import com.swart.scryfallapiV2.util.UrlUtil;

/**
 * @author jake swart
 */
public class CardsCodeNumberImpl implements CardsCodeNumberInf {

  private final CardsCodeNumberLanguageInf languageInst;
  private final CardsCodeNumberFormatInf formatInst;
  private final CardsCodeNumberFaceInf faceInst;
  private final CardsCodeNumberVersionInf versionInst;

  private SetDBEnum set = null;
  private Integer collectorNumber = null;
  private CardsCodeNumberLanguageEnum language = CardsCodeNumberLanguageEnum.EN;
  private CardsCodeNumberFormatEnum format = CardsCodeNumberFormatEnum.JSON;
  private CardsCodeNumberFaceEnum face = CardsCodeNumberFaceEnum.FRONT;
  private CardsCodeNumberVersionEnum version = CardsCodeNumberVersionEnum.LARGE;
  private Boolean pretty = Boolean.FALSE;

  public CardsCodeNumberImpl() {
    languageInst = new CardsCodeNumberLanguageImpl(this);
    formatInst = new CardsCodeNumberFormatImpl(this);
    faceInst = new CardsCodeNumberFaceImpl(this);
    versionInst = new CardsCodeNumberVersionImpl(this);
  }

  private String formatEndpointUrlAsString(final List<String> urlOptions) {
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/%s/%s/%s%s%s", ScryFallApiConstants.BASE_API_URL, set.toString(),
        collectorNumber, language, question, options);
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
  public CardsCodeNumberInf withSet(final SetDBEnum set) {
    this.set = set;
    return this;
  }

  public CardsCodeNumberLanguageInf withLang() {
    return languageInst;
  }

  public CardsCodeNumberFormatInf withFormat() {
    return formatInst;
  }

  public CardsCodeNumberFaceInf withFace() {
    return faceInst;
  }

  public CardsCodeNumberVersionInf withVersion() {
    return versionInst;
  }

  public CardsCodeNumberInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public void setSet(final SetDBEnum set) {
    this.set = set;
  }

  public CardsCodeNumberInf withCollectorNumber(final int collectorNumber) {
    this.collectorNumber = collectorNumber;
    return this;
  }

  public void setLanguage(final CardsCodeNumberLanguageEnum language) {
    this.language = language;
  }

  public void setFace(final CardsCodeNumberFaceEnum face) {
    this.face = face;
  }

  public void setVersion(final CardsCodeNumberVersionEnum version) {
    this.version = version;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsCodeNumberFormatEnum format) {
    this.format = format;
  }

  private List<String> fromVerbose() {

    if (set == null) {
      throw new IllegalArgumentException("A three to five letter set code must be defined.");
    }
    if (collectorNumber == null) {
      throw new IllegalArgumentException("The collector number must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("face=%s", this.face.toString()));
    params.add(String.format("version=%s", this.version.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    if (set == null) {
      throw new IllegalArgumentException("A three to five letter set code must be defined.");
    }
    if (collectorNumber == null) {
      throw new IllegalArgumentException("The collector number must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    if (format != CardsCodeNumberFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (face != CardsCodeNumberFaceEnum.FRONT) {
      params.add(String.format("face=%s", face));
    }
    if (version != CardsCodeNumberVersionEnum.LARGE) {
      params.add(String.format("version=%s", version));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

package io.github.jswart.scryfallfluentapi.query.cards.named;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.github.jswart.scryfallfluentapi.model.SetDBEnum;
import io.github.jswart.scryfallfluentapi.query.ScryFallApiConstants;
import io.github.jswart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class CardsNamedImpl implements CardsNamedInf {

  private final CardsNamedFormatInf formatInst;
  private final CardsNamedFaceInf faceInst;
  private final CardsNamedVersionInf versionInst;

  private String exact = "";
  private String fuzzy = "";
  private SetDBEnum set = null;
  private CardsNamedFormatEnum format = CardsNamedFormatEnum.JSON;
  private CardsNamedFaceEnum face = CardsNamedFaceEnum.FRONT;
  private CardsNamedVersionEnum version = CardsNamedVersionEnum.LARGE;
  private Boolean pretty = Boolean.FALSE;

  public CardsNamedImpl() {
    formatInst = new CardsNamedFormatImpl(this);
    faceInst = new CardsNamedFaceImpl(this);
    versionInst = new CardsNamedVersionImpl(this);
  }

  public URL buildUrl() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/named%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public URL buildVerboseUrl() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/named%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public String build() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/named%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    return urlStr;
  }

  public String buildVerbose() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/named%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    return urlStr;
  }

  /* Client options */
  public CardsNamedInf withExact(final String exact) {
    this.exact = exact;
    return this;
  }

  public CardsNamedInf withFuzzy(final String fuzzy) {
    this.fuzzy = fuzzy;
    return this;
  }

  public CardsNamedInf withSet(final SetDBEnum set) {
    this.set = set;
    return this;
  }

  public CardsNamedFormatInf withFormat() {
    return formatInst;
  }

  public CardsNamedFaceInf withFace() {
    return faceInst;
  }

  public CardsNamedVersionInf withVersion() {
    return versionInst;
  }

  public CardsNamedInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  public void setSet(final SetDBEnum set) {
    this.set = set;
  }

  public void setFace(final CardsNamedFaceEnum face) {
    this.face = face;
  }

  public void setVersion(final CardsNamedVersionEnum version) {
    this.version = version;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsNamedFormatEnum format) {
    this.format = format;
  }

  private List<String> fromVerbose() {

    if (exact.isEmpty() && fuzzy.isEmpty()) {
      throw new IllegalArgumentException("Either exact or fuzzy must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    params.add(String.format("exact=%s", UrlUtil.urlEncodeString(exact)));
    params.add(String.format("fuzzy=%s", UrlUtil.urlEncodeString(fuzzy)));
    if (set != null) {
      params.add(String.format("set=%s", this.set.toString()));
    }
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("face=%s", this.face.toString()));
    params.add(String.format("version=%s", this.version.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    if (exact.isEmpty() && fuzzy.isEmpty()) {
      throw new IllegalArgumentException("Either exact or fuzzy must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    if (!exact.isEmpty()) {
      params.add(String.format("exact=%s", UrlUtil.urlEncodeString(exact)));
    }
    if (!fuzzy.isEmpty()) {
      params.add(String.format("fuzzy=%s", UrlUtil.urlEncodeString(fuzzy)));
    }
    if (set != null) {
      params.add(String.format("set=%s", set));
    }
    if (format != CardsNamedFormatEnum.JSON) {
      params.add(String.format("format=%s", format));
    }
    if (face != CardsNamedFaceEnum.FRONT) {
      params.add(String.format("face=%s", face));
    }
    if (version != CardsNamedVersionEnum.LARGE) {
      params.add(String.format("version=%s", version));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

package io.github.jswart.scryfallfluentapi.query.cards.autocomplete;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.github.jswart.scryfallfluentapi.query.ScryFallApiConstants;
import io.github.jswart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class CardsAutoCompleteImpl implements CardsAutoCompleteInf {

  private final CardsAutoCompleteFormatInf formatInst;

  private String query = "";
  private CardsAutoCompleteFormatEnum format = CardsAutoCompleteFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public CardsAutoCompleteImpl() {
    formatInst = new CardsAutoCompleteFormatImpl(this);
  }

  public URL buildUrl() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/autocomplete%s%s", ScryFallApiConstants.BASE_API_URL, question,
        options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public URL buildVerboseUrl() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/autocomplete%s%s", ScryFallApiConstants.BASE_API_URL, question,
        options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public String build() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/autocomplete%s%s", ScryFallApiConstants.BASE_API_URL, question,
        options);
    return urlStr;
  }

  public String buildVerbose() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/autocomplete%s%s", ScryFallApiConstants.BASE_API_URL, question,
        options);
    return urlStr;
  }

  public CardsAutoCompleteInf withQuery(final String query) {
    this.query = query;
    return this;
  }

  public CardsAutoCompleteInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsAutoCompleteFormatEnum format) {
    this.format = format;
  }

  public CardsAutoCompleteFormatInf withFormat() {
    return formatInst;
  }

  private List<String> fromVerbose() {

    if (query.isEmpty()) {
      throw new IllegalArgumentException("An autocomplete query must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    params.add(String.format("q=%s", UrlUtil.urlEncodeString(this.query)));
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    if (query.isEmpty()) {
      throw new IllegalArgumentException("An autocomplete query must be defined.");
    }

    final List<String> params = new ArrayList<String>();
    params.add(String.format("q=%s", UrlUtil.urlEncodeString(this.query)));
    if (format != CardsAutoCompleteFormatEnum.JSON) {
      params.add(String.format("format=%s", this.format.toString()));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

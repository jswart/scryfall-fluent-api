package com.swart.scryfallapiV2.query.cards.search;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallapiV2.query.ScryFallApiConstants;
import com.swart.scryfallapiV2.util.UrlUtil;

public class CardsSearch implements CardsSearchInf {

  private final CardsSearchUniqueInf uniqueInst;
  private final CardsSearchOrderInf orderInst;
  private final CardsSearchDirectionInf directionInst;
  private final CardsSearchFormatInf formatInst;

  private String query = "";
  private CardsSearchUnique unique = CardsSearchUnique.CARDS;
  private CardsSearchOrder order = CardsSearchOrder.NAME;
  private CardsSearchDirection direction = CardsSearchDirection.AUTO;
  private Boolean includeExtras = Boolean.FALSE;
  private Boolean includeMultilingual = Boolean.FALSE;
  private Boolean includeVariations = Boolean.FALSE;
  private Integer page = 1;
  private CardsSearchFormatEnum format = CardsSearchFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public CardsSearch() {
    uniqueInst = new CardsSearchUniqueImpl(this);
    orderInst = new CardsSearchOrderImpl(this);
    directionInst = new CardsSearchDirectionImpl(this);
    formatInst = new CardsSearchFormatImpl(this);
  }

  public URL buildUrl() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/search%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public URL buildVerboseUrl() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/search%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public String build() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/search%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    return urlStr;
  }

  public String buildVerbose() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards/search%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    return urlStr;
  }

  /* Client options */
  public CardsSearchUniqueInf withUnique() {
    return uniqueInst;
  }

  public CardsSearchOrderInf withOrder() {
    return orderInst;
  }

  public CardsSearchDirectionInf withDirection() {
    return directionInst;
  }

  public CardsSearchInf withQuery(final String query) {
    if (query != null) {
      this.query = query;
    }
    return this;
  }

  public CardsSearchInf withIncludeExtras() {
    this.includeExtras = Boolean.TRUE;
    return this;
  }

  public CardsSearchInf withIncludeMultilingual() {
    this.includeMultilingual = Boolean.TRUE;
    return this;
  }

  public CardsSearchInf withIncludeVariations() {
    this.includeVariations = Boolean.TRUE;
    return this;
  }

  public CardsSearchInf withPage(final int pageNumber) {
    this.page = pageNumber;
    return this;
  }

  public CardsSearchInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsSearchFormatEnum format) {
    this.format = format;
  }

  public void setUnique(final CardsSearchUnique unique) {
    this.unique = unique;
  }

  public void setOrder(final CardsSearchOrder order) {
    this.order = order;
  }

  public void setDirection(final CardsSearchDirection direction) {
    this.direction = direction;
  }

  public CardsSearchFormatInf withFormat() {
    return formatInst;
  }

  private List<String> fromVerbose() {

    final List<String> params = new ArrayList<String>();
    if (!query.isEmpty()) {
      params.add(String.format("q=%s", UrlUtil.urlEncodeString(query)));
    }
    params.add(String.format("unique=%s", this.unique.toString()));
    params.add(String.format("order=%s", this.order.toString()));
    params.add(String.format("dir=%s", this.direction.toString()));
    params.add(String.format("include_extras=%s", this.includeExtras.toString()));
    params.add(String.format("include_multilingual=%s", this.includeMultilingual.toString()));
    params.add(String.format("include_variations=%s", this.includeVariations.toString()));
    params.add(String.format("page=%s", this.page));
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    final List<String> params = new ArrayList<String>();
    if (!query.isEmpty()) {
      params.add(String.format("q=%s", UrlUtil.urlEncodeString(query)));
    }
    if (unique != CardsSearchUnique.CARDS) {
      params.add(String.format("unique=%s", this.unique.toString()));
    }
    if (order != CardsSearchOrder.NAME) {
      params.add(String.format("order=%s", this.order.toString()));
    }
    if (direction != CardsSearchDirection.AUTO) {
      params.add(String.format("dir=%s", this.direction.toString()));
    }
    if (includeExtras) {
      params.add(String.format("include_extras=%s", this.includeExtras.toString()));
    }
    if (includeMultilingual) {
      params.add(String.format("include_multilingual=%s", this.includeMultilingual.toString()));
    }
    if (includeVariations) {
      params.add(String.format("include_variations=%s", this.includeVariations.toString()));
    }
    if (page != 1) {
      params.add(String.format("page=%s", this.page));
    }
    if (format != CardsSearchFormatEnum.JSON) {
      params.add(String.format("format=%s", this.format.toString()));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

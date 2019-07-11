package com.swart.scryfallapiV2.query.search;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallapiV2.query.ScryFallApiConstants;
import com.swart.scryfallapiV2.util.UrlUtil;

public class CardsSearch implements CardsSearchInf {

  private final CardSearchUniqueInf uniqueInst;
  private final CardSearchOrderInf orderInst;
  private final CardSearchDirectionInf directionInst;
  private final CardSearchFormatInf formatInst;

  private String query = "";
  private CardSearchUnique unique = CardSearchUnique.CARDS;
  private CardSearchOrder order = CardSearchOrder.NAME;
  private CardSearchDirection direction = CardSearchDirection.AUTO;
  private Boolean includeExtras = Boolean.FALSE;
  private Boolean includeMultilingual = Boolean.FALSE;
  private Boolean includeVariations = Boolean.FALSE;
  private Integer page = 1;
  private CardSearchFormatEnum format = CardSearchFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public CardsSearch() {
    uniqueInst = new CardSearchUniqueImpl(this);
    orderInst = new CardSearchOrderImpl(this);
    directionInst = new CardSearchDirectionImpl(this);
    formatInst = new CardSearchFormatImpl(this);
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
  public CardSearchUniqueInf withUnique() {
    return uniqueInst;
  }

  public CardSearchOrderInf withOrder() {
    return orderInst;
  }

  public CardSearchDirectionInf withDirection() {
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

  public CardsSearchInf withpretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardSearchFormatEnum format) {
    this.format = format;
  }

  public void setUnique(final CardSearchUnique unique) {
    this.unique = unique;
  }

  public void setOrder(final CardSearchOrder order) {
    this.order = order;
  }

  public void setDirection(final CardSearchDirection direction) {
    this.direction = direction;
  }

  public CardSearchFormatInf withFormat() {
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
    if (unique != CardSearchUnique.CARDS) {
      params.add(String.format("unique=%s", this.unique.toString()));
    }
    if (order != CardSearchOrder.NAME) {
      params.add(String.format("order=%s", this.order.toString()));
    }
    if (direction != CardSearchDirection.AUTO) {
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
    if (format != CardSearchFormatEnum.JSON) {
      params.add(String.format("format=%s", this.format.toString()));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

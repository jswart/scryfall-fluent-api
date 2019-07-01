package com.swart.scryfallapiV2.query.search;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallapiV2.query.ScryFallApiConstants;
import com.swart.scryfallapiV2.util.UrlUtil;

public class CardsSearch implements CardsSearchInf {

//  private final SearchBuilder searchBuilder = new SearchBuilder();
  private final UniqueSearchInf us;

//  private String query = "";
  private CardSearchUnique unique = CardSearchUnique.CARDS;
//  private CardSearchOrder order = CardSearchOrder.NAME;
//  private CardSearchDirection direction = CardSearchDirection.AUTO;
//  private Boolean includeExtras = Boolean.FALSE;
//  private Boolean includeMultilingual = Boolean.FALSE;
//  private Boolean includeVariations = Boolean.FALSE;
//  private Integer page = 1;
//  private CardSearchFormat format = CardSearchFormat.JSON;
//  private Boolean pretty = Boolean.FALSE;

  public CardsSearch() {
    us = new UniqueSearch(this);
  }

  public URL buildUrl() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final URL url = UrlUtil.createUrl(String.format("%s/cards/search?%s", ScryFallApiConstants.BASE_API_URL, options));
    return url;
  }

  public URL buildVerboseUrl() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final URL url = UrlUtil.createUrl(String.format("%s/cards/search?%s", ScryFallApiConstants.BASE_API_URL, options));
    return url;
  }

  public UniqueSearchInf unique() {
    return us;
  }

  public void setUnique(final CardSearchUnique unique) {
    this.unique = unique;
  }

  public UniqueSearchInf getUs() {
    return us;
  }

  private List<String> fromVerbose() {

    final List<String> params = new ArrayList<String>();
//    if (!options.getQuery().isEmpty()) {
//      params.add(String.format("q=%s", UrlUtil.urlEncodeString(options.getQuery())));
//    }
    params.add(String.format("unique=%s", this.unique.toString()));
//    params.add(String.format("order=%s", stripToEmpty(options.getOrder())));
//    params.add(String.format("dir=%s", stripToEmpty(options.getDirection())));
//    params.add(String.format("include_extras=%s", options.getIncludeExtras()));
//    params.add(String.format("include_multilingual=%s", options.getIncludeMultilingual()));
//    params.add(String.format("include_variations=%s", options.getIncludeVariations()));
//    params.add(String.format("page=%s", options.getPage()));
//    params.add(String.format("format=%s", stripToEmpty(options.getFormat())));
//    params.add(String.format("pretty=%s", options.getPretty()));
    return params;
  }

  private List<String> from() {

    final List<String> params = new ArrayList<String>();

    return params;
  }

}

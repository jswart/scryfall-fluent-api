package com.swart.scryfallapiV2.query;

import com.swart.scryfallapiV2.query.search.CardsSearch;
import com.swart.scryfallapiV2.query.search.CardsSearchInf;

public class QueryCardsImpl implements QueryCardsInf {

  public CardsSearchInf search() {
    return new CardsSearch();
  }

}

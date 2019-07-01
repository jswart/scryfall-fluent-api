package com.swart.scryfallapiV2.query;

public class Query implements QueryInf {

  public QueryCardsInf card() {
    return new QueryCards();
  }

}

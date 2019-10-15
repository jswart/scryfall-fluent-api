package com.swart.scryfallapiV2.query.cards.search;

public class CardsSearchFormatImpl implements CardsSearchFormatInf {

  CardsSearchImpl cardSearch = null;

  protected CardsSearchFormatImpl(final CardsSearchImpl cardSearch) {
    this.cardSearch = cardSearch;
  }

  public CardsSearchInf json() {
    cardSearch.setFormat(CardsSearchFormatEnum.JSON);
    return cardSearch;
  }

  public CardsSearchInf csv() {
    cardSearch.setFormat(CardsSearchFormatEnum.CSV);
    return cardSearch;
  }

}

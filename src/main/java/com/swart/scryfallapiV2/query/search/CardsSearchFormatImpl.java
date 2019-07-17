package com.swart.scryfallapiV2.query.search;

public class CardsSearchFormatImpl implements CardsSearchFormatInf {

  CardsSearch cardSearch = null;

  protected CardsSearchFormatImpl(final CardsSearch cardSearch) {
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

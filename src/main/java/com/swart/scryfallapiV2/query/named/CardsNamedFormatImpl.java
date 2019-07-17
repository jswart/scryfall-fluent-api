package com.swart.scryfallapiV2.query.named;

public class CardsNamedFormatImpl implements CardsNamedFormatInf {

  CardsNamed cardSearch = null;

  protected CardsNamedFormatImpl(final CardsNamed cardSearch) {
    this.cardSearch = cardSearch;
  }

  public CardsNamedInf json() {
    cardSearch.setFormat(CardsNamedFormatEnum.JSON);
    return cardSearch;
  }

  public CardsNamedInf text() {
    cardSearch.setFormat(CardsNamedFormatEnum.TEXT);
    return cardSearch;
  }

  public CardsNamedInf image() {
    cardSearch.setFormat(CardsNamedFormatEnum.IMAGE);
    return cardSearch;
  }

}

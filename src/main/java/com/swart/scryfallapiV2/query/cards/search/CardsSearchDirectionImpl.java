package com.swart.scryfallapiV2.query.cards.search;

public class CardsSearchDirectionImpl implements CardsSearchDirectionInf {

  CardsSearchImpl cardSearch = null;

  protected CardsSearchDirectionImpl(final CardsSearchImpl cardSearch) {
    this.cardSearch = cardSearch;
  }

  public CardsSearchInf auto() {
    cardSearch.setDirection(CardsSearchDirection.AUTO);
    return cardSearch;
  }

  public CardsSearchInf asc() {
    cardSearch.setDirection(CardsSearchDirection.ASC);
    return cardSearch;
  }

  public CardsSearchInf desc() {
    cardSearch.setDirection(CardsSearchDirection.DESC);
    return cardSearch;
  }

}

package com.swart.scryfallapiV2.query.cards.search;

public class CardsSearchUniqueImpl implements CardsSearchUniqueInf {

  CardsSearchImpl cardSearch = null;

  protected CardsSearchUniqueImpl(final CardsSearchImpl cardSearch) {
    this.cardSearch = cardSearch;
  }

  public CardsSearchInf cards() {
    cardSearch.setUnique(CardsSearchUnique.CARDS);
    return cardSearch;
  }

  public CardsSearchInf art() {
    cardSearch.setUnique(CardsSearchUnique.ART);
    return cardSearch;
  }

  public CardsSearchInf prints() {
    cardSearch.setUnique(CardsSearchUnique.PRINTS);
    return cardSearch;
  }

}

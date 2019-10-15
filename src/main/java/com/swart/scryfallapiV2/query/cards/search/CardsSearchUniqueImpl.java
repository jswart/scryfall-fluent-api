package com.swart.scryfallapiV2.query.cards.search;

public class CardsSearchUniqueImpl implements CardsSearchUniqueInf {

  CardsSearch cardSearch = null;

  protected CardsSearchUniqueImpl(final CardsSearch cardSearch) {
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

package com.swart.scryfallapiV2.query.search;

public class UniqueSearch implements UniqueSearchInf {

  CardsSearch cardSearch = null;

  protected UniqueSearch(final CardsSearch cardSearch) {
    this.cardSearch = cardSearch;
  }

  public CardsSearchInf cards() {
    cardSearch.setUnique(CardSearchUnique.CARDS);
    return cardSearch;
  }

  public CardsSearchInf art() {
    cardSearch.setUnique(CardSearchUnique.ART);
    return cardSearch;
  }

  public CardsSearchInf prints() {
    cardSearch.setUnique(CardSearchUnique.PRINTS);
    return cardSearch;
  }

}

package com.swart.scryfallapiV2.query.search;

public class CardSearchFormatImpl implements CardSearchFormatInf {

  CardsSearch cardSearch = null;

  protected CardSearchFormatImpl(final CardsSearch cardSearch) {
    this.cardSearch = cardSearch;
  }

  public CardsSearchInf json() {
    cardSearch.setFormat(CardSearchFormatEnum.JSON);
    return cardSearch;
  }

  public CardsSearchInf csv() {
    cardSearch.setFormat(CardSearchFormatEnum.CSV);
    return cardSearch;
  }

}

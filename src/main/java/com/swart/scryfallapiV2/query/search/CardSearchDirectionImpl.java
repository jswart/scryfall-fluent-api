package com.swart.scryfallapiV2.query.search;

public class CardSearchDirectionImpl implements CardSearchDirectionInf {

  CardsSearch cardSearch = null;

  protected CardSearchDirectionImpl(final CardsSearch cardSearch) {
    this.cardSearch = cardSearch;
  }

  public CardsSearchInf auto() {
    cardSearch.setDirection(CardSearchDirection.AUTO);
    return cardSearch;
  }

  public CardsSearchInf asc() {
    cardSearch.setDirection(CardSearchDirection.ASC);
    return cardSearch;
  }

  public CardsSearchInf desc() {
    cardSearch.setDirection(CardSearchDirection.DESC);
    return cardSearch;
  }

}

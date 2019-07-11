package com.swart.scryfallapiV2.query.search;

public class CardSearchOrderImpl implements CardSearchOrderInf {

  CardsSearch cardSearch = null;

  protected CardSearchOrderImpl(final CardsSearch cardSearch) {
    this.cardSearch = cardSearch;
  }

  public CardsSearchInf name() {
    cardSearch.setOrder(CardSearchOrder.NAME);
    return cardSearch;
  }

  public CardsSearchInf set() {
    cardSearch.setOrder(CardSearchOrder.SET);
    return cardSearch;
  }

  public CardsSearchInf released() {
    cardSearch.setOrder(CardSearchOrder.RELEASED);
    return cardSearch;
  }

  public CardsSearchInf rarity() {
    cardSearch.setOrder(CardSearchOrder.RARITY);
    return cardSearch;
  }

  public CardsSearchInf color() {
    cardSearch.setOrder(CardSearchOrder.COLOR);
    return cardSearch;
  }

  public CardsSearchInf usd() {
    cardSearch.setOrder(CardSearchOrder.USD);
    return cardSearch;
  }

  public CardsSearchInf ti() {
    cardSearch.setOrder(CardSearchOrder.TI);
    return cardSearch;
  }

  public CardsSearchInf eur() {
    cardSearch.setOrder(CardSearchOrder.EUR);
    return cardSearch;
  }

  public CardsSearchInf cmc() {
    cardSearch.setOrder(CardSearchOrder.CMC);
    return cardSearch;
  }

  public CardsSearchInf power() {
    cardSearch.setOrder(CardSearchOrder.POWER);
    return cardSearch;
  }

  public CardsSearchInf toughness() {
    cardSearch.setOrder(CardSearchOrder.TOUGHNESS);
    return cardSearch;
  }

  public CardsSearchInf edhrec() {
    cardSearch.setOrder(CardSearchOrder.EDHREC);
    return cardSearch;
  }

  public CardsSearchInf artist() {
    cardSearch.setOrder(CardSearchOrder.ARTIST);
    return cardSearch;
  }

}

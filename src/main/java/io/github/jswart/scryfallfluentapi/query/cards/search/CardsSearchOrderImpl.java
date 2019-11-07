package io.github.jswart.scryfallfluentapi.query.cards.search;

/**
 * @author jake swart
 */
public class CardsSearchOrderImpl implements CardsSearchOrderInf {

  CardsSearchImpl cardSearch = null;

  protected CardsSearchOrderImpl(final CardsSearchImpl cardSearch) {
    this.cardSearch = cardSearch;
  }

  public CardsSearchInf name() {
    cardSearch.setOrder(CardsSearchOrder.NAME);
    return cardSearch;
  }

  public CardsSearchInf set() {
    cardSearch.setOrder(CardsSearchOrder.SET);
    return cardSearch;
  }

  public CardsSearchInf released() {
    cardSearch.setOrder(CardsSearchOrder.RELEASED);
    return cardSearch;
  }

  public CardsSearchInf rarity() {
    cardSearch.setOrder(CardsSearchOrder.RARITY);
    return cardSearch;
  }

  public CardsSearchInf color() {
    cardSearch.setOrder(CardsSearchOrder.COLOR);
    return cardSearch;
  }

  public CardsSearchInf usd() {
    cardSearch.setOrder(CardsSearchOrder.USD);
    return cardSearch;
  }

  public CardsSearchInf ti() {
    cardSearch.setOrder(CardsSearchOrder.TI);
    return cardSearch;
  }

  public CardsSearchInf eur() {
    cardSearch.setOrder(CardsSearchOrder.EUR);
    return cardSearch;
  }

  public CardsSearchInf cmc() {
    cardSearch.setOrder(CardsSearchOrder.CMC);
    return cardSearch;
  }

  public CardsSearchInf power() {
    cardSearch.setOrder(CardsSearchOrder.POWER);
    return cardSearch;
  }

  public CardsSearchInf toughness() {
    cardSearch.setOrder(CardsSearchOrder.TOUGHNESS);
    return cardSearch;
  }

  public CardsSearchInf edhrec() {
    cardSearch.setOrder(CardsSearchOrder.EDHREC);
    return cardSearch;
  }

  public CardsSearchInf artist() {
    cardSearch.setOrder(CardsSearchOrder.ARTIST);
    return cardSearch;
  }

}

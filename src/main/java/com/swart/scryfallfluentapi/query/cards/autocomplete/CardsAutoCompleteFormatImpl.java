package com.swart.scryfallfluentapi.query.cards.autocomplete;

/**
 * @author jake swart
 */
public class CardsAutoCompleteFormatImpl implements CardsAutoCompleteFormatInf {

  CardsAutoCompleteImpl card = null;

  protected CardsAutoCompleteFormatImpl(final CardsAutoCompleteImpl card) {
    this.card = card;
  }

  public CardsAutoCompleteInf json() {
    card.setFormat(CardsAutoCompleteFormatEnum.JSON);
    return card;
  }

}

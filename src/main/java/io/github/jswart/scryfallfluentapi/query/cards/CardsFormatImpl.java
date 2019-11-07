package io.github.jswart.scryfallfluentapi.query.cards;

/**
 * @author jake swart
 */
public class CardsFormatImpl implements CardsFormatInf {

  CardsImpl card = null;

  protected CardsFormatImpl(final CardsImpl card) {
    this.card = card;
  }

  public CardsInf json() {
    card.setFormat(CardsFormatEnum.JSON);
    return card;
  }

}

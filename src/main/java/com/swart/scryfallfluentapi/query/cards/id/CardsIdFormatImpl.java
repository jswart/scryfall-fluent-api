package com.swart.scryfallfluentapi.query.cards.id;

/**
 * @author jake swart
 */
public class CardsIdFormatImpl implements CardsIdFormatInf {

  CardsIdImpl cardNamed = null;

  protected CardsIdFormatImpl(final CardsIdImpl cardNamed) {
    this.cardNamed = cardNamed;
  }

  public CardsIdInf json() {
    cardNamed.setFormat(CardsIdFormatEnum.JSON);
    return cardNamed;
  }

  public CardsIdInf text() {
    cardNamed.setFormat(CardsIdFormatEnum.TEXT);
    return cardNamed;
  }

  public CardsIdInf image() {
    cardNamed.setFormat(CardsIdFormatEnum.IMAGE);
    return cardNamed;
  }

}

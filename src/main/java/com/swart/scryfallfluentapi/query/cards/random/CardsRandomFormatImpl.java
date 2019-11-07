package com.swart.scryfallfluentapi.query.cards.random;

/**
 * @author jake swart
 */
public class CardsRandomFormatImpl implements CardsRandomFormatInf {

  CardsRandomImpl cardsRandom = null;

  protected CardsRandomFormatImpl(final CardsRandomImpl cardsRandom) {
    this.cardsRandom = cardsRandom;
  }

  public CardsRandomInf json() {
    cardsRandom.setFormat(CardsRandomFormatEnum.JSON);
    return cardsRandom;
  }

  public CardsRandomInf csv() {
    cardsRandom.setFormat(CardsRandomFormatEnum.CSV);
    return cardsRandom;
  }

}

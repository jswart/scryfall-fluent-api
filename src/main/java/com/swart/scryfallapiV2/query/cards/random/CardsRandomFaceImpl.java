package com.swart.scryfallapiV2.query.cards.random;

/**
 * @author jake swart
 */
public class CardsRandomFaceImpl implements CardsRandomFaceInf {

  CardsRandomImpl cardsRandom = null;

  protected CardsRandomFaceImpl(final CardsRandomImpl cardsRandom) {
    this.cardsRandom = cardsRandom;
  }

  public CardsRandomInf front() {
    cardsRandom.setFace(CardsRandomFaceEnum.FRONT);
    return cardsRandom;
  }

  public CardsRandomInf back() {
    cardsRandom.setFace(CardsRandomFaceEnum.BACK);
    return cardsRandom;
  }

}

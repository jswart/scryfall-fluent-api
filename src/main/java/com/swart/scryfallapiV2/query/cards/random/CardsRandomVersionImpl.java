package com.swart.scryfallapiV2.query.cards.random;

public class CardsRandomVersionImpl implements CardsRandomVersionInf {

  CardsRandomImpl cardsRandom = null;

  protected CardsRandomVersionImpl(final CardsRandomImpl cardsRandom) {
    this.cardsRandom = cardsRandom;
  }

  public CardsRandomInf small() {
    cardsRandom.setVersion(CardsRandomVersionEnum.SMALL);
    return cardsRandom;
  }

  public CardsRandomInf normal() {
    cardsRandom.setVersion(CardsRandomVersionEnum.NORMAL);
    return cardsRandom;
  }

  public CardsRandomInf large() {
    cardsRandom.setVersion(CardsRandomVersionEnum.LARGE);
    return cardsRandom;
  }

  public CardsRandomInf png() {
    cardsRandom.setVersion(CardsRandomVersionEnum.PNG);
    return cardsRandom;
  }

  public CardsRandomInf artCrop() {
    cardsRandom.setVersion(CardsRandomVersionEnum.ART_CROP);
    return cardsRandom;
  }

  public CardsRandomInf borderCrop() {
    cardsRandom.setVersion(CardsRandomVersionEnum.BORDER_CROP);
    return cardsRandom;
  }

}

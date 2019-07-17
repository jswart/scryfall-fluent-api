package com.swart.scryfallapiV2.query.named;

public class CardsNamedVersionImpl implements CardsNamedVersionInf {

  CardsNamed cardsNamed = null;

  protected CardsNamedVersionImpl(final CardsNamed cardSearch) {
    this.cardsNamed = cardSearch;
  }

  public CardsNamedInf small() {
    cardsNamed.setVersion(CardsNamedVersionEnum.SMALL);
    return cardsNamed;
  }

  public CardsNamedInf normal() {
    cardsNamed.setVersion(CardsNamedVersionEnum.NORMAL);
    return cardsNamed;
  }

  public CardsNamedInf large() {
    cardsNamed.setVersion(CardsNamedVersionEnum.LARGE);
    return cardsNamed;
  }

  public CardsNamedInf png() {
    cardsNamed.setVersion(CardsNamedVersionEnum.PNG);
    return cardsNamed;
  }

  public CardsNamedInf artCrop() {
    cardsNamed.setVersion(CardsNamedVersionEnum.ART_CROP);
    return cardsNamed;
  }

  public CardsNamedInf borderCrop() {
    cardsNamed.setVersion(CardsNamedVersionEnum.BORDER_CROP);
    return cardsNamed;
  }

}
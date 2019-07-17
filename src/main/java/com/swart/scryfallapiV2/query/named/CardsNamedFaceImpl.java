package com.swart.scryfallapiV2.query.named;

public class CardsNamedFaceImpl implements CardsNamedFaceInf {

  CardsNamed cardsNamed = null;

  protected CardsNamedFaceImpl(final CardsNamed cardSearch) {
    this.cardsNamed = cardSearch;
  }

  public CardsNamedInf front() {
    cardsNamed.setFace(CardsNamedFaceEnum.FRONT);
    return cardsNamed;
  }

  public CardsNamedInf back() {
    cardsNamed.setFace(CardsNamedFaceEnum.BACK);
    return cardsNamed;
  }

}

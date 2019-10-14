package com.swart.scryfallapiV2.query.named;

public class CardsNamedFaceImpl implements CardsNamedFaceInf {

  CardsNamedImpl cardsNamed = null;

  protected CardsNamedFaceImpl(final CardsNamedImpl cardNamed) {
    this.cardsNamed = cardNamed;
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

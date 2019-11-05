package com.swart.scryfallapiV2.query.cards.id;

/**
 * @author jake swart
 */
public class CardsIdFaceImpl implements CardsIdFaceInf {

  CardsIdImpl tcgplayerId = null;

  protected CardsIdFaceImpl(final CardsIdImpl cardNamed) {
    this.tcgplayerId = cardNamed;
  }

  public CardsIdInf front() {
    tcgplayerId.setFace(CardsIdFaceEnum.FRONT);
    return tcgplayerId;
  }

  public CardsIdInf back() {
    tcgplayerId.setFace(CardsIdFaceEnum.BACK);
    return tcgplayerId;
  }

}

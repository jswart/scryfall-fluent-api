package com.swart.scryfallapiV2.query.cards.multiverseid;

/**
 * @author jake swart
 */
public class CardsMultiverseIdFaceImpl implements CardsMultiverseIdFaceInf {

  CardsMultiverseIdImpl multiverseId = null;

  protected CardsMultiverseIdFaceImpl(final CardsMultiverseIdImpl cardNamed) {
    this.multiverseId = cardNamed;
  }

  public CardsMultiverseIdInf front() {
    multiverseId.setFace(CardsMultiverseIdFaceEnum.FRONT);
    return multiverseId;
  }

  public CardsMultiverseIdInf back() {
    multiverseId.setFace(CardsMultiverseIdFaceEnum.BACK);
    return multiverseId;
  }

}

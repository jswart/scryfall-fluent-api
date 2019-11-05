package com.swart.scryfallapiV2.query.cards.arenaid;

/**
 * @author jake swart
 */
public class CardsArenaIdFaceImpl implements CardsArenaIdFaceInf {

  CardsArenaIdImpl arenaId = null;

  protected CardsArenaIdFaceImpl(final CardsArenaIdImpl cardNamed) {
    this.arenaId = cardNamed;
  }

  public CardsArenaIdInf front() {
    arenaId.setFace(CardsArenaIdFaceEnum.FRONT);
    return arenaId;
  }

  public CardsArenaIdInf back() {
    arenaId.setFace(CardsArenaIdFaceEnum.BACK);
    return arenaId;
  }

}

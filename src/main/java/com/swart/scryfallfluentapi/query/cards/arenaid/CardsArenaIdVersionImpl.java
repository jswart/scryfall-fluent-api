package com.swart.scryfallfluentapi.query.cards.arenaid;

/**
 * @author jake swart
 */
public class CardsArenaIdVersionImpl implements CardsArenaIdVersionInf {

  CardsArenaIdImpl arenaId = null;

  protected CardsArenaIdVersionImpl(final CardsArenaIdImpl cardNamed) {
    this.arenaId = cardNamed;
  }

  public CardsArenaIdInf small() {
    arenaId.setVersion(CardsArenaIdVersionEnum.SMALL);
    return arenaId;
  }

  public CardsArenaIdInf normal() {
    arenaId.setVersion(CardsArenaIdVersionEnum.NORMAL);
    return arenaId;
  }

  public CardsArenaIdInf large() {
    arenaId.setVersion(CardsArenaIdVersionEnum.LARGE);
    return arenaId;
  }

  public CardsArenaIdInf png() {
    arenaId.setVersion(CardsArenaIdVersionEnum.PNG);
    return arenaId;
  }

  public CardsArenaIdInf artCrop() {
    arenaId.setVersion(CardsArenaIdVersionEnum.ART_CROP);
    return arenaId;
  }

  public CardsArenaIdInf borderCrop() {
    arenaId.setVersion(CardsArenaIdVersionEnum.BORDER_CROP);
    return arenaId;
  }

}

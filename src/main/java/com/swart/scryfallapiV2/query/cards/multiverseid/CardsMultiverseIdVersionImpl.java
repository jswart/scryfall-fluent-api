package com.swart.scryfallapiV2.query.cards.multiverseid;

/**
 * @author jake swart
 */
public class CardsMultiverseIdVersionImpl implements CardsMultiverseIdVersionInf {

  CardsMultiverseIdImpl multiverseId = null;

  protected CardsMultiverseIdVersionImpl(final CardsMultiverseIdImpl cardNamed) {
    this.multiverseId = cardNamed;
  }

  public CardsMultiverseIdInf small() {
    multiverseId.setVersion(CardsMultiverseIdVersionEnum.SMALL);
    return multiverseId;
  }

  public CardsMultiverseIdInf normal() {
    multiverseId.setVersion(CardsMultiverseIdVersionEnum.NORMAL);
    return multiverseId;
  }

  public CardsMultiverseIdInf large() {
    multiverseId.setVersion(CardsMultiverseIdVersionEnum.LARGE);
    return multiverseId;
  }

  public CardsMultiverseIdInf png() {
    multiverseId.setVersion(CardsMultiverseIdVersionEnum.PNG);
    return multiverseId;
  }

  public CardsMultiverseIdInf artCrop() {
    multiverseId.setVersion(CardsMultiverseIdVersionEnum.ART_CROP);
    return multiverseId;
  }

  public CardsMultiverseIdInf borderCrop() {
    multiverseId.setVersion(CardsMultiverseIdVersionEnum.BORDER_CROP);
    return multiverseId;
  }

}

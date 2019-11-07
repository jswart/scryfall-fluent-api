package com.swart.scryfallfluentapi.query.cards.id;

/**
 * @author jake swart
 */
public class CardsIdVersionImpl implements CardsIdVersionInf {

  CardsIdImpl tcgplayerId = null;

  protected CardsIdVersionImpl(final CardsIdImpl cardNamed) {
    this.tcgplayerId = cardNamed;
  }

  public CardsIdInf small() {
    tcgplayerId.setVersion(CardsIdVersionEnum.SMALL);
    return tcgplayerId;
  }

  public CardsIdInf normal() {
    tcgplayerId.setVersion(CardsIdVersionEnum.NORMAL);
    return tcgplayerId;
  }

  public CardsIdInf large() {
    tcgplayerId.setVersion(CardsIdVersionEnum.LARGE);
    return tcgplayerId;
  }

  public CardsIdInf png() {
    tcgplayerId.setVersion(CardsIdVersionEnum.PNG);
    return tcgplayerId;
  }

  public CardsIdInf artCrop() {
    tcgplayerId.setVersion(CardsIdVersionEnum.ART_CROP);
    return tcgplayerId;
  }

  public CardsIdInf borderCrop() {
    tcgplayerId.setVersion(CardsIdVersionEnum.BORDER_CROP);
    return tcgplayerId;
  }

}

package com.swart.scryfallapiV2.query.cards.tcgplayerid;

/**
 * @author jake swart
 */
public class CardsTcgplayerIdVersionImpl implements CardsTcgplayerIdVersionInf {

  CardsTcgplayerIdImpl tcgplayerId = null;

  protected CardsTcgplayerIdVersionImpl(final CardsTcgplayerIdImpl cardNamed) {
    this.tcgplayerId = cardNamed;
  }

  public CardsTcgplayerIdInf small() {
    tcgplayerId.setVersion(CardsTcgplayerIdVersionEnum.SMALL);
    return tcgplayerId;
  }

  public CardsTcgplayerIdInf normal() {
    tcgplayerId.setVersion(CardsTcgplayerIdVersionEnum.NORMAL);
    return tcgplayerId;
  }

  public CardsTcgplayerIdInf large() {
    tcgplayerId.setVersion(CardsTcgplayerIdVersionEnum.LARGE);
    return tcgplayerId;
  }

  public CardsTcgplayerIdInf png() {
    tcgplayerId.setVersion(CardsTcgplayerIdVersionEnum.PNG);
    return tcgplayerId;
  }

  public CardsTcgplayerIdInf artCrop() {
    tcgplayerId.setVersion(CardsTcgplayerIdVersionEnum.ART_CROP);
    return tcgplayerId;
  }

  public CardsTcgplayerIdInf borderCrop() {
    tcgplayerId.setVersion(CardsTcgplayerIdVersionEnum.BORDER_CROP);
    return tcgplayerId;
  }

}

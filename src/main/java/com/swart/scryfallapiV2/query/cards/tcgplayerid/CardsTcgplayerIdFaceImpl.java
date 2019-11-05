package com.swart.scryfallapiV2.query.cards.tcgplayerid;

/**
 * @author jake swart
 */
public class CardsTcgplayerIdFaceImpl implements CardsTcgplayerIdFaceInf {

  CardsTcgplayerIdImpl tcgplayerId = null;

  protected CardsTcgplayerIdFaceImpl(final CardsTcgplayerIdImpl cardNamed) {
    this.tcgplayerId = cardNamed;
  }

  public CardsTcgplayerIdInf front() {
    tcgplayerId.setFace(CardsTcgplayerIdFaceEnum.FRONT);
    return tcgplayerId;
  }

  public CardsTcgplayerIdInf back() {
    tcgplayerId.setFace(CardsTcgplayerIdFaceEnum.BACK);
    return tcgplayerId;
  }

}

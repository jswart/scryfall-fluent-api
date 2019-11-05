package com.swart.scryfallapiV2.query.cards.mtgoid;

/**
 * @author jake swart
 */
public class CardsMtgoIdFaceImpl implements CardsMtgoIdFaceInf {

  CardsMtgoIdImpl mtgoId = null;

  protected CardsMtgoIdFaceImpl(final CardsMtgoIdImpl cardNamed) {
    this.mtgoId = cardNamed;
  }

  public CardsMtgoIdInf front() {
    mtgoId.setFace(CardsMtgoIdFaceEnum.FRONT);
    return mtgoId;
  }

  public CardsMtgoIdInf back() {
    mtgoId.setFace(CardsMtgoIdFaceEnum.BACK);
    return mtgoId;
  }

}

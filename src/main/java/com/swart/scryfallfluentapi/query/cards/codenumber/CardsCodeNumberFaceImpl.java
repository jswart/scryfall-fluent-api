package com.swart.scryfallfluentapi.query.cards.codenumber;

/**
 * @author jake swart
 */
public class CardsCodeNumberFaceImpl implements CardsCodeNumberFaceInf {

  CardsCodeNumberImpl codeNumber = null;

  protected CardsCodeNumberFaceImpl(final CardsCodeNumberImpl cardNamed) {
    this.codeNumber = cardNamed;
  }

  public CardsCodeNumberInf front() {
    codeNumber.setFace(CardsCodeNumberFaceEnum.FRONT);
    return codeNumber;
  }

  public CardsCodeNumberInf back() {
    codeNumber.setFace(CardsCodeNumberFaceEnum.BACK);
    return codeNumber;
  }

}

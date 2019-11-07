package com.swart.scryfallfluentapi.query.cards.codenumber;

/**
 * @author jake swart
 */
public class CardsCodeNumberVersionImpl implements CardsCodeNumberVersionInf {

  CardsCodeNumberImpl codeNumber = null;

  protected CardsCodeNumberVersionImpl(final CardsCodeNumberImpl cardNamed) {
    this.codeNumber = cardNamed;
  }

  public CardsCodeNumberInf small() {
    codeNumber.setVersion(CardsCodeNumberVersionEnum.SMALL);
    return codeNumber;
  }

  public CardsCodeNumberInf normal() {
    codeNumber.setVersion(CardsCodeNumberVersionEnum.NORMAL);
    return codeNumber;
  }

  public CardsCodeNumberInf large() {
    codeNumber.setVersion(CardsCodeNumberVersionEnum.LARGE);
    return codeNumber;
  }

  public CardsCodeNumberInf png() {
    codeNumber.setVersion(CardsCodeNumberVersionEnum.PNG);
    return codeNumber;
  }

  public CardsCodeNumberInf artCrop() {
    codeNumber.setVersion(CardsCodeNumberVersionEnum.ART_CROP);
    return codeNumber;
  }

  public CardsCodeNumberInf borderCrop() {
    codeNumber.setVersion(CardsCodeNumberVersionEnum.BORDER_CROP);
    return codeNumber;
  }

}

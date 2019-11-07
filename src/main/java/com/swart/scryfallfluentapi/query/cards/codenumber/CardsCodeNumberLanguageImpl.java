package com.swart.scryfallfluentapi.query.cards.codenumber;

/**
 * @author jake swart
 */
public class CardsCodeNumberLanguageImpl implements CardsCodeNumberLanguageInf {

  CardsCodeNumberImpl codeNumber = null;

  protected CardsCodeNumberLanguageImpl(final CardsCodeNumberImpl cardNamed) {
    this.codeNumber = cardNamed;
  }

  public CardsCodeNumberInf english() {
    codeNumber.setLanguage(CardsCodeNumberLanguageEnum.EN);
    return codeNumber;
  }

  public CardsCodeNumberInf french() {
    codeNumber.setLanguage(CardsCodeNumberLanguageEnum.FR);
    return codeNumber;
  }

}

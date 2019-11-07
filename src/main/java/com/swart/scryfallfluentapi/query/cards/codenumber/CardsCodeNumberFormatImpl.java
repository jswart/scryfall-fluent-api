package com.swart.scryfallfluentapi.query.cards.codenumber;

/**
 * @author jake swart
 */
public class CardsCodeNumberFormatImpl implements CardsCodeNumberFormatInf {

  CardsCodeNumberImpl cardNamed = null;

  protected CardsCodeNumberFormatImpl(final CardsCodeNumberImpl cardNamed) {
    this.cardNamed = cardNamed;
  }

  public CardsCodeNumberInf json() {
    cardNamed.setFormat(CardsCodeNumberFormatEnum.JSON);
    return cardNamed;
  }

  public CardsCodeNumberInf text() {
    cardNamed.setFormat(CardsCodeNumberFormatEnum.TEXT);
    return cardNamed;
  }

  public CardsCodeNumberInf image() {
    cardNamed.setFormat(CardsCodeNumberFormatEnum.IMAGE);
    return cardNamed;
  }

}

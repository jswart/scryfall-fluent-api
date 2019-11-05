package com.swart.scryfallapiV2.query.cards.mtgoid;

/**
 * @author jake swart
 */
public class CardsMtgoIdFormatImpl implements CardsMtgoIdFormatInf {

  CardsMtgoIdImpl cardNamed = null;

  protected CardsMtgoIdFormatImpl(final CardsMtgoIdImpl cardNamed) {
    this.cardNamed = cardNamed;
  }

  public CardsMtgoIdInf json() {
    cardNamed.setFormat(CardsMtgoIdFormatEnum.JSON);
    return cardNamed;
  }

  public CardsMtgoIdInf text() {
    cardNamed.setFormat(CardsMtgoIdFormatEnum.TEXT);
    return cardNamed;
  }

  public CardsMtgoIdInf image() {
    cardNamed.setFormat(CardsMtgoIdFormatEnum.IMAGE);
    return cardNamed;
  }

}

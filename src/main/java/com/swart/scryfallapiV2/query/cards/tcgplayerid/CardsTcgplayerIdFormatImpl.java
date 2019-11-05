package com.swart.scryfallapiV2.query.cards.tcgplayerid;

/**
 * @author jake swart
 */
public class CardsTcgplayerIdFormatImpl implements CardsTcgplayerIdFormatInf {

  CardsTcgplayerIdImpl cardNamed = null;

  protected CardsTcgplayerIdFormatImpl(final CardsTcgplayerIdImpl cardNamed) {
    this.cardNamed = cardNamed;
  }

  public CardsTcgplayerIdInf json() {
    cardNamed.setFormat(CardsTcgplayerIdFormatEnum.JSON);
    return cardNamed;
  }

  public CardsTcgplayerIdInf text() {
    cardNamed.setFormat(CardsTcgplayerIdFormatEnum.TEXT);
    return cardNamed;
  }

  public CardsTcgplayerIdInf image() {
    cardNamed.setFormat(CardsTcgplayerIdFormatEnum.IMAGE);
    return cardNamed;
  }

}

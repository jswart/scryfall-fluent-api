package com.swart.scryfallfluentapi.query.cards.arenaid;

/**
 * @author jake swart
 */
public class CardsArenaIdFormatImpl implements CardsArenaIdFormatInf {

  CardsArenaIdImpl cardNamed = null;

  protected CardsArenaIdFormatImpl(final CardsArenaIdImpl cardNamed) {
    this.cardNamed = cardNamed;
  }

  public CardsArenaIdInf json() {
    cardNamed.setFormat(CardsArenaIdFormatEnum.JSON);
    return cardNamed;
  }

  public CardsArenaIdInf text() {
    cardNamed.setFormat(CardsArenaIdFormatEnum.TEXT);
    return cardNamed;
  }

  public CardsArenaIdInf image() {
    cardNamed.setFormat(CardsArenaIdFormatEnum.IMAGE);
    return cardNamed;
  }

}

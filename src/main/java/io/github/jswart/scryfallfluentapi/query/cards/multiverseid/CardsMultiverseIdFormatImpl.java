package io.github.jswart.scryfallfluentapi.query.cards.multiverseid;

/**
 * @author jake swart
 */
public class CardsMultiverseIdFormatImpl implements CardsMultiverseIdFormatInf {

  CardsMultiverseIdImpl cardNamed = null;

  protected CardsMultiverseIdFormatImpl(final CardsMultiverseIdImpl cardNamed) {
    this.cardNamed = cardNamed;
  }

  public CardsMultiverseIdInf json() {
    cardNamed.setFormat(CardsMultiverseIdFormatEnum.JSON);
    return cardNamed;
  }

  public CardsMultiverseIdInf text() {
    cardNamed.setFormat(CardsMultiverseIdFormatEnum.TEXT);
    return cardNamed;
  }

  public CardsMultiverseIdInf image() {
    cardNamed.setFormat(CardsMultiverseIdFormatEnum.IMAGE);
    return cardNamed;
  }

}

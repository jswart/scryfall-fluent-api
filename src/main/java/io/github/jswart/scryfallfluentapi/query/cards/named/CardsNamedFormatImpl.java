package io.github.jswart.scryfallfluentapi.query.cards.named;

/**
 * @author jake swart
 */
public class CardsNamedFormatImpl implements CardsNamedFormatInf {

  CardsNamedImpl cardNamed = null;

  protected CardsNamedFormatImpl(final CardsNamedImpl cardNamed) {
    this.cardNamed = cardNamed;
  }

  public CardsNamedInf json() {
    cardNamed.setFormat(CardsNamedFormatEnum.JSON);
    return cardNamed;
  }

  public CardsNamedInf text() {
    cardNamed.setFormat(CardsNamedFormatEnum.TEXT);
    return cardNamed;
  }

  public CardsNamedInf image() {
    cardNamed.setFormat(CardsNamedFormatEnum.IMAGE);
    return cardNamed;
  }

}

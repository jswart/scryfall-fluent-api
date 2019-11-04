package com.swart.scryfallapiV2.query.cards.named;

/**
 * @author jake swart
 */
public class CardsNamedVersionImpl implements CardsNamedVersionInf {

  CardsNamedImpl cardsNamed = null;

  protected CardsNamedVersionImpl(final CardsNamedImpl cardNamed) {
    this.cardsNamed = cardNamed;
  }

  public CardsNamedInf small() {
    cardsNamed.setVersion(CardsNamedVersionEnum.SMALL);
    return cardsNamed;
  }

  public CardsNamedInf normal() {
    cardsNamed.setVersion(CardsNamedVersionEnum.NORMAL);
    return cardsNamed;
  }

  public CardsNamedInf large() {
    cardsNamed.setVersion(CardsNamedVersionEnum.LARGE);
    return cardsNamed;
  }

  public CardsNamedInf png() {
    cardsNamed.setVersion(CardsNamedVersionEnum.PNG);
    return cardsNamed;
  }

  public CardsNamedInf artCrop() {
    cardsNamed.setVersion(CardsNamedVersionEnum.ART_CROP);
    return cardsNamed;
  }

  public CardsNamedInf borderCrop() {
    cardsNamed.setVersion(CardsNamedVersionEnum.BORDER_CROP);
    return cardsNamed;
  }

}

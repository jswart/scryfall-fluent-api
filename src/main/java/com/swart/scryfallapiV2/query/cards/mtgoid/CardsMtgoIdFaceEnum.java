package com.swart.scryfallapiV2.query.cards.mtgoid;

/**
 * @author jake swart
 */
public enum CardsMtgoIdFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

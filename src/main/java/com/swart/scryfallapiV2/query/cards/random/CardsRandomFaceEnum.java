package com.swart.scryfallapiV2.query.cards.random;

/**
 *
 * @author jake swart
 *
 */
public enum CardsRandomFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

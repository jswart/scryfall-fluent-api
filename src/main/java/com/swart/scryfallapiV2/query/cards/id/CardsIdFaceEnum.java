package com.swart.scryfallapiV2.query.cards.id;

/**
 * @author jake swart
 */
public enum CardsIdFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

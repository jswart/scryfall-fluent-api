package com.swart.scryfallapiV2.query.cards.multiverseid;

/**
 * @author jake swart
 */
public enum CardsMultiverseIdFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

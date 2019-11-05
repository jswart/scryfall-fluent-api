package com.swart.scryfallapiV2.query.cards.arenaid;

/**
 * @author jake swart
 */
public enum CardsArenaIdFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

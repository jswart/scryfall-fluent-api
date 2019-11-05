package com.swart.scryfallapiV2.query.cards.arenaid;

/**
 * @author jake swart
 */
public enum CardsArenaIdFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

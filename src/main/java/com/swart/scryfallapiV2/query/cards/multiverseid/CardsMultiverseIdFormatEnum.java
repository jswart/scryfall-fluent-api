package com.swart.scryfallapiV2.query.cards.multiverseid;

/**
 * @author jake swart
 */
public enum CardsMultiverseIdFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
package com.swart.scryfallapiV2.query.cards.multiverseid;

/**
 * @author jake swart
 */
public enum CardsMultiverseIdVersionEnum {
  SMALL, NORMAL, LARGE, PNG, ART_CROP, BORDER_CROP;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

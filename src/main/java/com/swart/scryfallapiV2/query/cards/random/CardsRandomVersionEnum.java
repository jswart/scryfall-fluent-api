package com.swart.scryfallapiV2.query.cards.random;

/**
 * @author jake swart
 */
public enum CardsRandomVersionEnum {
  SMALL, NORMAL, LARGE, PNG, ART_CROP, BORDER_CROP;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
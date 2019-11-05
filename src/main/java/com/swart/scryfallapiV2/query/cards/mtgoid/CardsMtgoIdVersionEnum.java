package com.swart.scryfallapiV2.query.cards.mtgoid;

/**
 * @author jake swart
 */
public enum CardsMtgoIdVersionEnum {
  SMALL, NORMAL, LARGE, PNG, ART_CROP, BORDER_CROP;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

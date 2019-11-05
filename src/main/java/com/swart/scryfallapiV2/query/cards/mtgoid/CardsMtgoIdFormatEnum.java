package com.swart.scryfallapiV2.query.cards.mtgoid;

/**
 * @author jake swart
 */
public enum CardsMtgoIdFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

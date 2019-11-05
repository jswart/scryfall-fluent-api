package com.swart.scryfallapiV2.query.cards.tcgplayerid;

/**
 * @author jake swart
 */
public enum CardsTcgplayerIdFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package com.swart.scryfallapiV2.query.cards.random;

/**
 * @author jake swart
 */
public enum CardsRandomFormatEnum {
  JSON, CSV;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

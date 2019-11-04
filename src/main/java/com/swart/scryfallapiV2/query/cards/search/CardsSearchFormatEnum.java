package com.swart.scryfallapiV2.query.cards.search;

/**
 * @author jake swart
 */
public enum CardsSearchFormatEnum {
  JSON, CSV;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

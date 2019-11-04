package com.swart.scryfallapiV2.query.cards.codenumber;

/**
 * @author jake swart
 */
public enum CardsCodeNumberFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

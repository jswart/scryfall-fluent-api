package com.swart.scryfallapiV2.query.cards;

/**
 *
 * @author jake swart
 *
 */
public enum CardsFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

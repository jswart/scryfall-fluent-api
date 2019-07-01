package com.swart.scryfallapiV2.query.search;

/**
 *
 * @author jake swart
 *
 */
public enum CardSearchOrder {
  NAME, SET, RELEASED, RARITY, COLOR, USD, TI, EUR, CMC, POWER, TOUGHNESS, EDHREC, ARTIST;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

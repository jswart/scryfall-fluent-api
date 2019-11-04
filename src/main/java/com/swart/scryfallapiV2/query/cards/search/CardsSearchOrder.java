package com.swart.scryfallapiV2.query.cards.search;

/**
 * @author jake swart
 */
public enum CardsSearchOrder {
  NAME, SET, RELEASED, RARITY, COLOR, USD, TI, EUR, CMC, POWER, TOUGHNESS, EDHREC, ARTIST;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

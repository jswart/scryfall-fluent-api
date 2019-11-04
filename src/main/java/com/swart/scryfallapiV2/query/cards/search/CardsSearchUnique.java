package com.swart.scryfallapiV2.query.cards.search;

/**
 * @author jake swart
 */
public enum CardsSearchUnique {
  CARDS, ART, PRINTS;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

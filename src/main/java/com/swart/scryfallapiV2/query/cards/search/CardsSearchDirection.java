package com.swart.scryfallapiV2.query.cards.search;

/**
 *
 * @author jake swart
 *
 */
public enum CardsSearchDirection {
  AUTO, ASC, DESC;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package com.swart.scryfallapiV2.query.cards.autocomplete;

/**
 *
 * @author jake swart
 *
 */
public enum CardsAutoCompleteFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

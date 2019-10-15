package com.swart.scryfallapiV2.query.cards.named;

/**
 *
 * @author jake swart
 *
 */
public enum CardsNamedFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

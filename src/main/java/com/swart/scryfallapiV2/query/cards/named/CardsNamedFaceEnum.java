package com.swart.scryfallapiV2.query.cards.named;

/**
 *
 * @author jake swart
 *
 */
public enum CardsNamedFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
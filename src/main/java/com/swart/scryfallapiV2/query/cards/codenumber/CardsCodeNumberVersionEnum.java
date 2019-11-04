package com.swart.scryfallapiV2.query.cards.codenumber;

/**
 * @author jake swart
 */
public enum CardsCodeNumberVersionEnum {
  SMALL, NORMAL, LARGE, PNG, ART_CROP, BORDER_CROP;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

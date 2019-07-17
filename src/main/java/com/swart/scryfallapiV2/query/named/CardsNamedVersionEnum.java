package com.swart.scryfallapiV2.query.named;

/**
 *
 * @author jake swart
 *
 */
public enum CardsNamedVersionEnum {
  SMALL, NORMAL, LARGE, PNG, ART_CROP, BORDER_CROP;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

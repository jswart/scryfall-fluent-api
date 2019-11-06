package com.swart.scryfallapiV2.query.sets;

/**
 * @author jake swart
 */
public enum SetsFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

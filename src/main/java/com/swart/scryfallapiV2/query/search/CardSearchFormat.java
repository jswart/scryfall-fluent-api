package com.swart.scryfallapiV2.query.search;

/**
 *
 * @author jake swart
 *
 */
public enum CardSearchFormat {
  JSON, CSV;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

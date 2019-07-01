package com.swart.scryfallapiV2.query.search;

/**
 *
 * @author jake swart
 *
 */
public enum CardSearchDirection {
  AUTO, ASC, DESC;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package com.swart.scryfallapiV2.query.catalogs.powers;

/**
 * @author jake swart
 */
public enum CatalogPowersFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

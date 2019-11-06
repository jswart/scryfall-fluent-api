package com.swart.scryfallapiV2.query.catalogs.creaturetypes;

/**
 * @author jake swart
 */
public enum CatalogCreatureTypesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

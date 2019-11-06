package com.swart.scryfallapiV2.query.catalogs.spelltypes;

/**
 * @author jake swart
 */
public enum CatalogSpellTypesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package com.swart.scryfallapiV2.query.catalogs.landtypes;

/**
 * @author jake swart
 */
public enum CatalogLandTypesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

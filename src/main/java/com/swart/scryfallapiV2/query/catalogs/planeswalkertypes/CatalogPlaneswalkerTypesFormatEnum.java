package com.swart.scryfallapiV2.query.catalogs.planeswalkertypes;

/**
 * @author jake swart
 */
public enum CatalogPlaneswalkerTypesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

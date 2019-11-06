package com.swart.scryfallapiV2.query.catalogs.toughness;

/**
 * @author jake swart
 */
public enum CatalogToughnessFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

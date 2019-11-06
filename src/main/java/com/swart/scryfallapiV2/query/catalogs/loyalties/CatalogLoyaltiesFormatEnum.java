package com.swart.scryfallapiV2.query.catalogs.loyalties;

/**
 * @author jake swart
 */
public enum CatalogLoyaltiesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

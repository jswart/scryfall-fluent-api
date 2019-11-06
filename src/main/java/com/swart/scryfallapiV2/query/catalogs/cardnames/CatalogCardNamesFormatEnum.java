package com.swart.scryfallapiV2.query.catalogs.cardnames;

/**
 * @author jake swart
 */
public enum CatalogCardNamesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package com.swart.scryfallapiV2.query.catalogs.enchantmenttypes;

/**
 * @author jake swart
 */
public enum CatalogEnchantmentTypesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

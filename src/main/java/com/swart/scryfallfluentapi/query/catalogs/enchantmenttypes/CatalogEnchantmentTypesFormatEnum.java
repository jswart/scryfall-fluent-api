package com.swart.scryfallfluentapi.query.catalogs.enchantmenttypes;

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

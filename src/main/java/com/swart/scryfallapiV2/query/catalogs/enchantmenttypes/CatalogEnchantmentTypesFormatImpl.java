package com.swart.scryfallapiV2.query.catalogs.enchantmenttypes;

/**
 * @author jake swart
 */
public class CatalogEnchantmentTypesFormatImpl implements CatalogEnchantmentTypesFormatInf {

  CatalogEnchantmentTypesImpl setsImpl = null;

  protected CatalogEnchantmentTypesFormatImpl(final CatalogEnchantmentTypesImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogEnchantmentTypesInf json() {
    setsImpl.setFormat(CatalogEnchantmentTypesFormatEnum.JSON);
    return setsImpl;
  }

}

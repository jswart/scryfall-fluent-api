package com.swart.scryfallapiV2.query.catalogs.wordbank;

/**
 * @author jake swart
 */
public enum CatalogWordBankFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

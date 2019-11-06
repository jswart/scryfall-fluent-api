package com.swart.scryfallapiV2.query.catalogs.wordbank;

/**
 * @author jake swart
 */
public class CatalogWordBankFormatImpl implements CatalogWordBankFormatInf {

  CatalogWordBankImpl setsImpl = null;

  protected CatalogWordBankFormatImpl(final CatalogWordBankImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogWordBankInf json() {
    setsImpl.setFormat(CatalogWordBankFormatEnum.JSON);
    return setsImpl;
  }

}

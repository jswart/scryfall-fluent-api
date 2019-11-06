package com.swart.scryfallapiV2.query.catalogs.powers;

/**
 * @author jake swart
 */
public class CatalogPowersFormatImpl implements CatalogPowersFormatInf {

  CatalogPowersImpl setsImpl = null;

  protected CatalogPowersFormatImpl(final CatalogPowersImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogPowersInf json() {
    setsImpl.setFormat(CatalogPowersFormatEnum.JSON);
    return setsImpl;
  }

}

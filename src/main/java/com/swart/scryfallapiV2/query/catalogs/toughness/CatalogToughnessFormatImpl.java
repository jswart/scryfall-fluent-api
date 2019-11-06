package com.swart.scryfallapiV2.query.catalogs.toughness;

/**
 * @author jake swart
 */
public class CatalogToughnessFormatImpl implements CatalogToughnessFormatInf {

  CatalogToughnessImpl setsImpl = null;

  protected CatalogToughnessFormatImpl(final CatalogToughnessImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogToughnessInf json() {
    setsImpl.setFormat(CatalogToughnessFormatEnum.JSON);
    return setsImpl;
  }

}

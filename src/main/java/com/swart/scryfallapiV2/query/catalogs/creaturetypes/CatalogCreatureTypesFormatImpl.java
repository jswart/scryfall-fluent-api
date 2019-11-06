package com.swart.scryfallapiV2.query.catalogs.creaturetypes;

/**
 * @author jake swart
 */
public class CatalogCreatureTypesFormatImpl implements CatalogCreatureTypesFormatInf {

  CatalogCreatureTypesImpl setsImpl = null;

  protected CatalogCreatureTypesFormatImpl(final CatalogCreatureTypesImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogCreatureTypesInf json() {
    setsImpl.setFormat(CatalogCreatureTypesFormatEnum.JSON);
    return setsImpl;
  }

}

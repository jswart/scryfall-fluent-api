package com.swart.scryfallfluentapi.query.catalogs.loyalties;

/**
 * @author jake swart
 */
public class CatalogLoyaltiesFormatImpl implements CatalogLoyaltiesFormatInf {

  CatalogLoyaltiesImpl setsImpl = null;

  protected CatalogLoyaltiesFormatImpl(final CatalogLoyaltiesImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogLoyaltiesInf json() {
    setsImpl.setFormat(CatalogLoyaltiesFormatEnum.JSON);
    return setsImpl;
  }

}

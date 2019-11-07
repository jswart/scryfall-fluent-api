package com.swart.scryfallfluentapi.query.catalogs.watermarks;

/**
 * @author jake swart
 */
public class CatalogWatermarksFormatImpl implements CatalogWatermarksFormatInf {

  CatalogWatermarksImpl setsImpl = null;

  protected CatalogWatermarksFormatImpl(final CatalogWatermarksImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogWatermarksInf json() {
    setsImpl.setFormat(CatalogWatermarksFormatEnum.JSON);
    return setsImpl;
  }

}

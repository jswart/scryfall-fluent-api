package io.github.jswart.scryfallfluentapi.query.catalogs.landtypes;

/**
 * @author jake swart
 */
public class CatalogLandTypesFormatImpl implements CatalogLandTypesFormatInf {

  CatalogLandTypesImpl setsImpl = null;

  protected CatalogLandTypesFormatImpl(final CatalogLandTypesImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogLandTypesInf json() {
    setsImpl.setFormat(CatalogLandTypesFormatEnum.JSON);
    return setsImpl;
  }

}

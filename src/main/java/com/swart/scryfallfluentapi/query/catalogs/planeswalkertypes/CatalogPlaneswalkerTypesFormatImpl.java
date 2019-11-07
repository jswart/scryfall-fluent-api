package com.swart.scryfallfluentapi.query.catalogs.planeswalkertypes;

/**
 * @author jake swart
 */
public class CatalogPlaneswalkerTypesFormatImpl implements CatalogPlaneswalkerTypesFormatInf {

  CatalogPlaneswalkerTypesImpl setsImpl = null;

  protected CatalogPlaneswalkerTypesFormatImpl(final CatalogPlaneswalkerTypesImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogPlaneswalkerTypesInf json() {
    setsImpl.setFormat(CatalogPlaneswalkerTypesFormatEnum.JSON);
    return setsImpl;
  }

}

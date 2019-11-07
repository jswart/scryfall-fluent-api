package com.swart.scryfallfluentapi.query.catalogs.cardnames;

/**
 * @author jake swart
 */
public class CatalogCardNamesFormatImpl implements CatalogCardNamesFormatInf {

  CatalogCardNamesImpl setsImpl = null;

  protected CatalogCardNamesFormatImpl(final CatalogCardNamesImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogCardNamesInf json() {
    setsImpl.setFormat(CatalogCardNamesFormatEnum.JSON);
    return setsImpl;
  }

}

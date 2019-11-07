package com.swart.scryfallfluentapi.query.catalogs.artistnames;

/**
 * @author jake swart
 */
public class CatalogArtistNamesFormatImpl implements CatalogArtistNamesFormatInf {

  CatalogArtistNamesImpl setsImpl = null;

  protected CatalogArtistNamesFormatImpl(final CatalogArtistNamesImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogArtistNamesInf json() {
    setsImpl.setFormat(CatalogArtistNamesFormatEnum.JSON);
    return setsImpl;
  }

}

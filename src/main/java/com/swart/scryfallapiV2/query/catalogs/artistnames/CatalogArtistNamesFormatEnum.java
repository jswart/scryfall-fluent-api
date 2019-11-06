package com.swart.scryfallapiV2.query.catalogs.artistnames;

/**
 * @author jake swart
 */
public enum CatalogArtistNamesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

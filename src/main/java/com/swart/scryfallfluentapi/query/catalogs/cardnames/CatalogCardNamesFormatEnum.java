package com.swart.scryfallfluentapi.query.catalogs.cardnames;

/**
 * @author jake swart
 */
public enum CatalogCardNamesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

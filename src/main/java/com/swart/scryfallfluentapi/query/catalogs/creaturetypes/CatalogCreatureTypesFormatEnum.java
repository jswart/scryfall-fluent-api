package com.swart.scryfallfluentapi.query.catalogs.creaturetypes;

/**
 * @author jake swart
 */
public enum CatalogCreatureTypesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package com.swart.scryfallapiV2.query.catalogs.artifacttypes;

/**
 * @author jake swart
 */
public enum CatalogArtifactTypesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package com.swart.scryfallfluentapi.query.catalogs.toughness;

/**
 * @author jake swart
 */
public enum CatalogToughnessFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

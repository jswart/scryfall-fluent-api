package com.swart.scryfallfluentapi.query.catalogs.powers;

/**
 * @author jake swart
 */
public enum CatalogPowersFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

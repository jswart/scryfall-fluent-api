package io.github.jswart.scryfallfluentapi.query.catalogs.planeswalkertypes;

/**
 * @author jake swart
 */
public enum CatalogPlaneswalkerTypesFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package io.github.jswart.scryfallfluentapi.query.catalogs.creaturetypes;

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

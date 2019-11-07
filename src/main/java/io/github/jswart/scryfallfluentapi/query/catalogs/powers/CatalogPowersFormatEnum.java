package io.github.jswart.scryfallfluentapi.query.catalogs.powers;

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

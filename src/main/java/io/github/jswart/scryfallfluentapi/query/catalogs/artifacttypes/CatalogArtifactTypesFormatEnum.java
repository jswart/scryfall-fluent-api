package io.github.jswart.scryfallfluentapi.query.catalogs.artifacttypes;

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

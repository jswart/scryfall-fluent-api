package io.github.jswart.scryfallfluentapi.query.catalogs.watermarks;

/**
 * @author jake swart
 */
public enum CatalogWatermarksFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

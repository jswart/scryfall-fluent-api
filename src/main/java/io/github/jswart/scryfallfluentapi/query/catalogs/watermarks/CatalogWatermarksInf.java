package io.github.jswart.scryfallfluentapi.query.catalogs.watermarks;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogWatermarksInf extends BuildEndInf {

  CatalogWatermarksFormatInf withFormat();

  CatalogWatermarksInf withPretty();

}

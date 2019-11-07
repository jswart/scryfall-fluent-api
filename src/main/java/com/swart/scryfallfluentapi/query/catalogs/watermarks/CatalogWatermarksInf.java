package com.swart.scryfallfluentapi.query.catalogs.watermarks;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogWatermarksInf extends BuildEndInf {

  CatalogWatermarksFormatInf withFormat();

  CatalogWatermarksInf withPretty();

}

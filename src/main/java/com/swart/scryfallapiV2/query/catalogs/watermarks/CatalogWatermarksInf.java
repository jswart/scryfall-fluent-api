package com.swart.scryfallapiV2.query.catalogs.watermarks;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogWatermarksInf extends BuildEndInf {

  CatalogWatermarksFormatInf withFormat();

  CatalogWatermarksInf withPretty();

}

package com.swart.scryfallapiV2.query.catalogs.loyalties;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogLoyaltiesInf extends BuildEndInf {

  CatalogLoyaltiesFormatInf withFormat();

  CatalogLoyaltiesInf withPretty();

}

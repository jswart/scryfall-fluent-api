package com.swart.scryfallapiV2.query.catalogs.powers;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogPowersInf extends BuildEndInf {

  CatalogPowersFormatInf withFormat();

  CatalogPowersInf withPretty();

}

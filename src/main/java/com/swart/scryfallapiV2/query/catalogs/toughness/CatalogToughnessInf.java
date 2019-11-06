package com.swart.scryfallapiV2.query.catalogs.toughness;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogToughnessInf extends BuildEndInf {

  CatalogToughnessFormatInf withFormat();

  CatalogToughnessInf withPretty();

}

package com.swart.scryfallapiV2.query.catalogs.cardnames;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogCardNamesInf extends BuildEndInf {

  CatalogCardNamesFormatInf withFormat();

  CatalogCardNamesInf withPretty();

}

package com.swart.scryfallfluentapi.query.catalogs.cardnames;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogCardNamesInf extends BuildEndInf {

  CatalogCardNamesFormatInf withFormat();

  CatalogCardNamesInf withPretty();

}

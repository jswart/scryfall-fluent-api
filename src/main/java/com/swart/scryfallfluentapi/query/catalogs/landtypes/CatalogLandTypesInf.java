package com.swart.scryfallfluentapi.query.catalogs.landtypes;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogLandTypesInf extends BuildEndInf {

  CatalogLandTypesFormatInf withFormat();

  CatalogLandTypesInf withPretty();

}

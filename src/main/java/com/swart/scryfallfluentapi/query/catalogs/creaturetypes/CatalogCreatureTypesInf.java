package com.swart.scryfallfluentapi.query.catalogs.creaturetypes;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogCreatureTypesInf extends BuildEndInf {

  CatalogCreatureTypesFormatInf withFormat();

  CatalogCreatureTypesInf withPretty();

}

package io.github.jswart.scryfallfluentapi.query.catalogs.creaturetypes;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogCreatureTypesInf extends BuildEndInf {

  CatalogCreatureTypesFormatInf withFormat();

  CatalogCreatureTypesInf withPretty();

}

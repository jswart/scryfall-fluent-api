package io.github.jswart.scryfallfluentapi.query.catalogs.spelltypes;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogSpellTypesInf extends BuildEndInf {

  CatalogSpellTypesFormatInf withFormat();

  CatalogSpellTypesInf withPretty();

}

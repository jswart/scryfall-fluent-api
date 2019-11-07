package com.swart.scryfallfluentapi.query.catalogs.spelltypes;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogSpellTypesInf extends BuildEndInf {

  CatalogSpellTypesFormatInf withFormat();

  CatalogSpellTypesInf withPretty();

}

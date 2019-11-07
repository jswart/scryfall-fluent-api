package com.swart.scryfallfluentapi.query.catalogs.powers;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogPowersInf extends BuildEndInf {

  CatalogPowersFormatInf withFormat();

  CatalogPowersInf withPretty();

}

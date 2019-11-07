package io.github.jswart.scryfallfluentapi.query.catalogs.powers;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogPowersInf extends BuildEndInf {

  CatalogPowersFormatInf withFormat();

  CatalogPowersInf withPretty();

}

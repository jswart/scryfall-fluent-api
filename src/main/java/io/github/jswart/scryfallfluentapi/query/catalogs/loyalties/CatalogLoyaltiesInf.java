package io.github.jswart.scryfallfluentapi.query.catalogs.loyalties;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogLoyaltiesInf extends BuildEndInf {

  CatalogLoyaltiesFormatInf withFormat();

  CatalogLoyaltiesInf withPretty();

}

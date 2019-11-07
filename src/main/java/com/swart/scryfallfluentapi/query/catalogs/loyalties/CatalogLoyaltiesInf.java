package com.swart.scryfallfluentapi.query.catalogs.loyalties;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogLoyaltiesInf extends BuildEndInf {

  CatalogLoyaltiesFormatInf withFormat();

  CatalogLoyaltiesInf withPretty();

}

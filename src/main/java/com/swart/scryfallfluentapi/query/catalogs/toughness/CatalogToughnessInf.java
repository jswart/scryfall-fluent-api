package com.swart.scryfallfluentapi.query.catalogs.toughness;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogToughnessInf extends BuildEndInf {

  CatalogToughnessFormatInf withFormat();

  CatalogToughnessInf withPretty();

}

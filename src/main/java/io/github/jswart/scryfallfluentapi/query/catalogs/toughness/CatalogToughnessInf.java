package io.github.jswart.scryfallfluentapi.query.catalogs.toughness;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogToughnessInf extends BuildEndInf {

  CatalogToughnessFormatInf withFormat();

  CatalogToughnessInf withPretty();

}

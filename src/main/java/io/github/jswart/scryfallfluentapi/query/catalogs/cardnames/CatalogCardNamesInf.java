package io.github.jswart.scryfallfluentapi.query.catalogs.cardnames;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogCardNamesInf extends BuildEndInf {

  CatalogCardNamesFormatInf withFormat();

  CatalogCardNamesInf withPretty();

}

package io.github.jswart.scryfallfluentapi.query.catalogs.artistnames;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogArtistNamesInf extends BuildEndInf {

  CatalogArtistNamesFormatInf withFormat();

  CatalogArtistNamesInf withPretty();

}

package com.swart.scryfallfluentapi.query.catalogs.artistnames;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogArtistNamesInf extends BuildEndInf {

  CatalogArtistNamesFormatInf withFormat();

  CatalogArtistNamesInf withPretty();

}

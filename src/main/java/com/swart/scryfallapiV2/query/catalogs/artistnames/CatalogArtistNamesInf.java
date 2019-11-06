package com.swart.scryfallapiV2.query.catalogs.artistnames;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogArtistNamesInf extends BuildEndInf {

  CatalogArtistNamesFormatInf withFormat();

  CatalogArtistNamesInf withPretty();

}

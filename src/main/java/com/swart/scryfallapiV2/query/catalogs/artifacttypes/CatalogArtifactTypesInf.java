package com.swart.scryfallapiV2.query.catalogs.artifacttypes;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogArtifactTypesInf extends BuildEndInf {

  CatalogArtifactTypesFormatInf withFormat();

  CatalogArtifactTypesInf withPretty();

}

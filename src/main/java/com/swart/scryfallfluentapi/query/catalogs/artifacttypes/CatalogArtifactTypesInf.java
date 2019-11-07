package com.swart.scryfallfluentapi.query.catalogs.artifacttypes;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogArtifactTypesInf extends BuildEndInf {

  CatalogArtifactTypesFormatInf withFormat();

  CatalogArtifactTypesInf withPretty();

}

package io.github.jswart.scryfallfluentapi.query.catalogs.artifacttypes;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogArtifactTypesInf extends BuildEndInf {

  CatalogArtifactTypesFormatInf withFormat();

  CatalogArtifactTypesInf withPretty();

}

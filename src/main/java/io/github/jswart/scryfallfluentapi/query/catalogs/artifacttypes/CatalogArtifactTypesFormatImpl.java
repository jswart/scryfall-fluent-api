package io.github.jswart.scryfallfluentapi.query.catalogs.artifacttypes;

/**
 * @author jake swart
 */
public class CatalogArtifactTypesFormatImpl implements CatalogArtifactTypesFormatInf {

  CatalogArtifactTypesImpl setsImpl = null;

  protected CatalogArtifactTypesFormatImpl(final CatalogArtifactTypesImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogArtifactTypesInf json() {
    setsImpl.setFormat(CatalogArtifactTypesFormatEnum.JSON);
    return setsImpl;
  }

}

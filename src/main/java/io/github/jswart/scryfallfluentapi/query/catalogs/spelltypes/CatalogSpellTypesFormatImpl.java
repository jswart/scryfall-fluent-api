package io.github.jswart.scryfallfluentapi.query.catalogs.spelltypes;

/**
 * @author jake swart
 */
public class CatalogSpellTypesFormatImpl implements CatalogSpellTypesFormatInf {

  CatalogSpellTypesImpl setsImpl = null;

  protected CatalogSpellTypesFormatImpl(final CatalogSpellTypesImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public CatalogSpellTypesInf json() {
    setsImpl.setFormat(CatalogSpellTypesFormatEnum.JSON);
    return setsImpl;
  }

}

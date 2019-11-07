package io.github.jswart.scryfallfluentapi.query.catalogs.wordbank;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogWordBankInf extends BuildEndInf {

  CatalogWordBankFormatInf withFormat();

  CatalogWordBankInf withPretty();

}

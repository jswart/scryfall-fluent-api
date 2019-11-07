package com.swart.scryfallfluentapi.query.catalogs.wordbank;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogWordBankInf extends BuildEndInf {

  CatalogWordBankFormatInf withFormat();

  CatalogWordBankInf withPretty();

}

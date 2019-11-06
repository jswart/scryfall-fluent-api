package com.swart.scryfallapiV2.query.catalogs.wordbank;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CatalogWordBankInf extends BuildEndInf {

  CatalogWordBankFormatInf withFormat();

  CatalogWordBankInf withPretty();

}

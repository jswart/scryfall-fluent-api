package com.swart.scryfallapiV2.query.symbology.parsemana;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SymbologyParseManaInf extends BuildEndInf {

  SymbologyParseManaInf withCost(String cost);

  SymbologyParseManaFormatInf withFormat();

  SymbologyParseManaInf withPretty();

}

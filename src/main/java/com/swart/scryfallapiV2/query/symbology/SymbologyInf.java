package com.swart.scryfallapiV2.query.symbology;

import com.swart.scryfallapiV2.query.BuildEndInf;
import com.swart.scryfallapiV2.query.symbology.parsemana.SymbologyParseManaInf;

/**
 * @author jake swart
 */
public interface SymbologyInf extends BuildEndInf {

  // /symbology
  SymbologyFormatInf withFormat();

  SymbologyInf withPretty();

  // /symbology/parse-mana
  SymbologyParseManaInf parsemana();

}

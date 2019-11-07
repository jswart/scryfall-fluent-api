package com.swart.scryfallfluentapi.query.symbology;

import com.swart.scryfallfluentapi.query.BuildEndInf;
import com.swart.scryfallfluentapi.query.symbology.parsemana.SymbologyParseManaInf;

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

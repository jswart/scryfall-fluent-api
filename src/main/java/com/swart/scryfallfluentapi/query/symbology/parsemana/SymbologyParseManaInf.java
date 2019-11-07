package com.swart.scryfallfluentapi.query.symbology.parsemana;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SymbologyParseManaInf extends BuildEndInf {

  SymbologyParseManaInf withCost(String cost);

  SymbologyParseManaFormatInf withFormat();

  SymbologyParseManaInf withPretty();

}

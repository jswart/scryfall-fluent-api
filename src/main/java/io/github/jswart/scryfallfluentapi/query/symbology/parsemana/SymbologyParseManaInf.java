package io.github.jswart.scryfallfluentapi.query.symbology.parsemana;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SymbologyParseManaInf extends BuildEndInf {

  SymbologyParseManaInf withCost(String cost);

  SymbologyParseManaFormatInf withFormat();

  SymbologyParseManaInf withPretty();

}

package io.github.jswart.scryfallfluentapi.query.symbology;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;
import io.github.jswart.scryfallfluentapi.query.symbology.parsemana.SymbologyParseManaInf;

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

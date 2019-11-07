package io.github.jswart.scryfallfluentapi.query.sets;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;
import io.github.jswart.scryfallfluentapi.query.sets.code.SetsCodeInf;
import io.github.jswart.scryfallfluentapi.query.sets.id.SetsIdInf;
import io.github.jswart.scryfallfluentapi.query.sets.tcgplayerid.SetsTcgplayerIdInf;

/**
 * @author jake swart
 */
public interface SetsInf extends BuildEndInf {

  // /sets
  SetsFormatInf withFormat();

  SetsInf withPretty();

  // /sets/code
  SetsCodeInf code();

  // /sets/tcgplayer/:id
  SetsTcgplayerIdInf tcgplayerId();

  // /sets/id
  SetsIdInf id();

}

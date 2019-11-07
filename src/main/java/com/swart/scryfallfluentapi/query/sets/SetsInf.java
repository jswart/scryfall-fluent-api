package com.swart.scryfallfluentapi.query.sets;

import com.swart.scryfallfluentapi.query.BuildEndInf;
import com.swart.scryfallfluentapi.query.sets.code.SetsCodeInf;
import com.swart.scryfallfluentapi.query.sets.id.SetsIdInf;
import com.swart.scryfallfluentapi.query.sets.tcgplayerid.SetsTcgplayerIdInf;

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

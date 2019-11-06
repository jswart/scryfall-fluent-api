package com.swart.scryfallapiV2.query.sets;

import com.swart.scryfallapiV2.query.BuildEndInf;
import com.swart.scryfallapiV2.query.sets.code.SetsCodeInf;
import com.swart.scryfallapiV2.query.sets.id.SetsIdInf;
import com.swart.scryfallapiV2.query.sets.tcgplayerid.SetsTcgplayerIdInf;

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

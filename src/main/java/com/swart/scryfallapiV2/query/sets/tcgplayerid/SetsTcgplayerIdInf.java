package com.swart.scryfallapiV2.query.sets.tcgplayerid;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SetsTcgplayerIdInf extends BuildEndInf {

  SetsTcgplayerIdInf withId(int id);

  SetsTcgplayerIdFormatInf withFormat();

  SetsTcgplayerIdInf withPretty();

}

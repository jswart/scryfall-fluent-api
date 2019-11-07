package com.swart.scryfallfluentapi.query.sets.tcgplayerid;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SetsTcgplayerIdInf extends BuildEndInf {

  SetsTcgplayerIdInf withId(int id);

  SetsTcgplayerIdFormatInf withFormat();

  SetsTcgplayerIdInf withPretty();

}

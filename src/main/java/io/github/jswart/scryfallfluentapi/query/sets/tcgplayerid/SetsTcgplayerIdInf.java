package io.github.jswart.scryfallfluentapi.query.sets.tcgplayerid;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SetsTcgplayerIdInf extends BuildEndInf {

  SetsTcgplayerIdInf withId(int id);

  SetsTcgplayerIdFormatInf withFormat();

  SetsTcgplayerIdInf withPretty();

}

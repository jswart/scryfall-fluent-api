package com.swart.scryfallfluentapi.query.cards.tcgplayerid;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsTcgplayerIdInf extends BuildEndInf {

  CardsTcgplayerIdInf withId(int id);

  CardsTcgplayerIdFormatInf withFormat();

  CardsTcgplayerIdFaceInf withFace();

  CardsTcgplayerIdVersionInf withVersion();

  CardsTcgplayerIdInf withPretty();

}

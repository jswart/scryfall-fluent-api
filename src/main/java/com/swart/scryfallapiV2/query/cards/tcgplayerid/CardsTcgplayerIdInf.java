package com.swart.scryfallapiV2.query.cards.tcgplayerid;

import com.swart.scryfallapiV2.query.BuildEndInf;

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

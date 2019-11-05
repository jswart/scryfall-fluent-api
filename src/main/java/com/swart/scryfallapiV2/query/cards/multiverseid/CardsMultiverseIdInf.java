package com.swart.scryfallapiV2.query.cards.multiverseid;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsMultiverseIdInf extends BuildEndInf {

  CardsMultiverseIdInf withId(int id);

  CardsMultiverseIdFormatInf withFormat();

  CardsMultiverseIdFaceInf withFace();

  CardsMultiverseIdVersionInf withVersion();

  CardsMultiverseIdInf withPretty();

}

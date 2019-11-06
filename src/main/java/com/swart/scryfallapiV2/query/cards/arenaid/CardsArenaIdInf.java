package com.swart.scryfallapiV2.query.cards.arenaid;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsArenaIdInf extends BuildEndInf {

  CardsArenaIdInf withRulings();

  CardsArenaIdInf withId(int id);

  CardsArenaIdFormatInf withFormat();

  CardsArenaIdFaceInf withFace();

  CardsArenaIdVersionInf withVersion();

  CardsArenaIdInf withPretty();

}

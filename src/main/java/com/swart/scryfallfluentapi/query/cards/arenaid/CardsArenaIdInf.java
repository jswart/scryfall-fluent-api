package com.swart.scryfallfluentapi.query.cards.arenaid;

import com.swart.scryfallfluentapi.query.BuildEndInf;

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

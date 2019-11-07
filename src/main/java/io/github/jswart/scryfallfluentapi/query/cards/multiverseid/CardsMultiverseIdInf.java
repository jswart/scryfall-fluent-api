package io.github.jswart.scryfallfluentapi.query.cards.multiverseid;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsMultiverseIdInf extends BuildEndInf {

  CardsMultiverseIdInf withRulings();

  CardsMultiverseIdInf withId(int id);

  CardsMultiverseIdFormatInf withFormat();

  CardsMultiverseIdFaceInf withFace();

  CardsMultiverseIdVersionInf withVersion();

  CardsMultiverseIdInf withPretty();

}

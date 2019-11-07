package io.github.jswart.scryfallfluentapi.query.cards.tcgplayerid;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

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

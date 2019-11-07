package io.github.jswart.scryfallfluentapi.query.cards.id;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsIdInf extends BuildEndInf {

  CardsIdInf withRulings();

  CardsIdInf withId(String uuid);

  CardsIdFormatInf withFormat();

  CardsIdFaceInf withFace();

  CardsIdVersionInf withVersion();

  CardsIdInf withPretty();

}

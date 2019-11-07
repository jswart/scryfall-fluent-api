package io.github.jswart.scryfallfluentapi.query.cards.mtgoid;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsMtgoIdInf extends BuildEndInf {

  CardsMtgoIdInf withRulings();

  CardsMtgoIdInf withId(int id);

  CardsMtgoIdFormatInf withFormat();

  CardsMtgoIdFaceInf withFace();

  CardsMtgoIdVersionInf withVersion();

  CardsMtgoIdInf withPretty();

}

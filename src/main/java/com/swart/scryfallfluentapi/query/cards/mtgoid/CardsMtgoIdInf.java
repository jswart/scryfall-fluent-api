package com.swart.scryfallfluentapi.query.cards.mtgoid;

import com.swart.scryfallfluentapi.query.BuildEndInf;

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

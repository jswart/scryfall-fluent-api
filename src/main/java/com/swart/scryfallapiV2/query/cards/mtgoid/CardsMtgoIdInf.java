package com.swart.scryfallapiV2.query.cards.mtgoid;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsMtgoIdInf extends BuildEndInf {

  CardsMtgoIdInf withId(int id);

  CardsMtgoIdFormatInf withFormat();

  CardsMtgoIdFaceInf withFace();

  CardsMtgoIdVersionInf withVersion();

  CardsMtgoIdInf withPretty();

}

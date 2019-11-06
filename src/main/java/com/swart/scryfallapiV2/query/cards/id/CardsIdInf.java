package com.swart.scryfallapiV2.query.cards.id;

import com.swart.scryfallapiV2.query.BuildEndInf;

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

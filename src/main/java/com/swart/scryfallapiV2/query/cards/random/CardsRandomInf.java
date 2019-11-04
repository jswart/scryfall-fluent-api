package com.swart.scryfallapiV2.query.cards.random;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsRandomInf extends BuildEndInf {

  CardsRandomInf withQuery(String query);

  CardsRandomFormatInf withFormat();

  CardsRandomFaceInf withFace();

  CardsRandomVersionInf withVersion();

  CardsRandomInf withPretty();

}
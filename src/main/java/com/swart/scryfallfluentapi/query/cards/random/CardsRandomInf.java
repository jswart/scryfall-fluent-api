package com.swart.scryfallfluentapi.query.cards.random;

import com.swart.scryfallfluentapi.query.BuildEndInf;

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

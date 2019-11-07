package io.github.jswart.scryfallfluentapi.query.cards.random;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

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

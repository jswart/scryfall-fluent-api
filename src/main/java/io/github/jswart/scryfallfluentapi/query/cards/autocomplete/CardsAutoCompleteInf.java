package io.github.jswart.scryfallfluentapi.query.cards.autocomplete;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsAutoCompleteInf extends BuildEndInf {

  CardsAutoCompleteInf withQuery(String query);

  CardsAutoCompleteFormatInf withFormat();

  CardsAutoCompleteInf withPretty();

}

package com.swart.scryfallfluentapi.query.cards.autocomplete;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsAutoCompleteInf extends BuildEndInf {

  CardsAutoCompleteInf withQuery(String query);

  CardsAutoCompleteFormatInf withFormat();

  CardsAutoCompleteInf withPretty();

}

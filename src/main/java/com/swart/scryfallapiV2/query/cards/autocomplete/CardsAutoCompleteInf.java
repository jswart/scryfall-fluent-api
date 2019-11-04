package com.swart.scryfallapiV2.query.cards.autocomplete;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsAutoCompleteInf extends BuildEndInf {

  CardsAutoCompleteInf withQuery(String query);

  CardsAutoCompleteFormatInf withFormat();

  CardsAutoCompleteInf withPretty();

}

package com.swart.scryfallapiV2.query.cards.search;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsSearchInf extends BuildEndInf {

  CardsSearchInf withQuery(String query);

  CardsSearchUniqueInf withUnique();

  CardsSearchOrderInf withOrder();

  CardsSearchDirectionInf withDirection();

  CardsSearchInf withIncludeExtras();

  CardsSearchInf withIncludeMultilingual();

  CardsSearchInf withIncludeVariations();

  CardsSearchInf withPage(int pageNumber);

  CardsSearchFormatInf withFormat();

  CardsSearchInf withPretty();

}

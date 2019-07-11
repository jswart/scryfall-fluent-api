package com.swart.scryfallapiV2.query.search;

import com.swart.scryfallapiV2.query.BuildEndInf;

public interface CardsSearchInf extends BuildEndInf {

  CardsSearchInf withQuery(String query);

  CardSearchUniqueInf withUnique();

  CardSearchOrderInf withOrder();

  CardSearchDirectionInf withDirection();

  CardsSearchInf withIncludeExtras();

  CardsSearchInf withIncludeMultilingual();

  CardsSearchInf withIncludeVariations();

  CardsSearchInf withPage(int pageNumber);

  CardSearchFormatInf withFormat();

  CardsSearchInf withpretty();

}

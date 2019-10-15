package com.swart.scryfallapiV2.query.cards.named;

import com.swart.scryfallapiV2.query.BuildEndInf;

public interface CardsNamedInf extends BuildEndInf {

  CardsNamedInf withExact(String exact);

  CardsNamedInf withFuzzy(String fuzzy);

  CardsNamedSetInf withSet();

  CardsNamedFormatInf withFormat();

  CardsNamedFaceInf withFace();

  CardsNamedVersionInf withVersion();

  CardsNamedInf withPretty();

}

package com.swart.scryfallapiV2.query.cards.named;

import com.swart.scryfallapiV2.model.SetDBEnum;
import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsNamedInf extends BuildEndInf {

  CardsNamedInf withExact(String exact);

  CardsNamedInf withFuzzy(String fuzzy);

  CardsNamedInf withSet(SetDBEnum set);

  CardsNamedFormatInf withFormat();

  CardsNamedFaceInf withFace();

  CardsNamedVersionInf withVersion();

  CardsNamedInf withPretty();

}

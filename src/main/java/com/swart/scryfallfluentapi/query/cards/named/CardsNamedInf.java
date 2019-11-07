package com.swart.scryfallfluentapi.query.cards.named;

import com.swart.scryfallfluentapi.model.SetDBEnum;
import com.swart.scryfallfluentapi.query.BuildEndInf;

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

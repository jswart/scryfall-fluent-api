package io.github.jswart.scryfallfluentapi.query.cards.named;

import io.github.jswart.scryfallfluentapi.model.SetDBEnum;
import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

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

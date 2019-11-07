package io.github.jswart.scryfallfluentapi.query.cards.codenumber;

import io.github.jswart.scryfallfluentapi.model.SetDBEnum;
import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsCodeNumberInf extends BuildEndInf {

  CardsCodeNumberInf withRulings();

  CardsCodeNumberInf withSet(SetDBEnum set);

  CardsCodeNumberInf withCollectorNumber(int collectorNumber);

  CardsCodeNumberLanguageInf withLang();

  CardsCodeNumberFormatInf withFormat();

  CardsCodeNumberFaceInf withFace();

  CardsCodeNumberVersionInf withVersion();

  CardsCodeNumberInf withPretty();

}

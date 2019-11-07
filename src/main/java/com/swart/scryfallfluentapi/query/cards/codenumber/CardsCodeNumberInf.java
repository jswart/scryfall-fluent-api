package com.swart.scryfallfluentapi.query.cards.codenumber;

import com.swart.scryfallfluentapi.model.SetDBEnum;
import com.swart.scryfallfluentapi.query.BuildEndInf;

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

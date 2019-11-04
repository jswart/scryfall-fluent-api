package com.swart.scryfallapiV2.query.cards.codenumber;

import com.swart.scryfallapiV2.model.SetDBEnum;
import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface CardsCodeNumberInf extends BuildEndInf {

  CardsCodeNumberInf withSet(SetDBEnum set);

  CardsCodeNumberInf withCollectorNumber(int collectorNumber);

  CardsCodeNumberLanguageInf withLang();

  CardsCodeNumberFormatInf withFormat();

  CardsCodeNumberFaceInf withFace();

  CardsCodeNumberVersionInf withVersion();

  CardsCodeNumberInf withPretty();

}

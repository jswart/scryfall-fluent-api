package com.swart.scryfallapiV2.query;

import com.swart.scryfallapiV2.query.cards.CardsImpl;
import com.swart.scryfallapiV2.query.cards.CardsInf;

public class Query {

  public static CardsInf cards() {
    return new CardsImpl();
  }

}

package com.swart.scryfallapiV2.query;

import com.swart.scryfallapiV2.query.cards.CardsImpl;
import com.swart.scryfallapiV2.query.cards.CardsInf;
import com.swart.scryfallapiV2.query.sets.SetsImpl;
import com.swart.scryfallapiV2.query.sets.SetsInf;

public class Query {

  public static CardsInf cards() {
    return new CardsImpl();
  }

  public static SetsInf sets() {
    return new SetsImpl();
  }

}

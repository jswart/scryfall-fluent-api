package com.swart.scryfallfluentapi.query;

import com.swart.scryfallfluentapi.query.cards.CardsImpl;
import com.swart.scryfallfluentapi.query.cards.CardsInf;
import com.swart.scryfallfluentapi.query.catalogs.CatalogImpl;
import com.swart.scryfallfluentapi.query.catalogs.CatalogInf;
import com.swart.scryfallfluentapi.query.sets.SetsImpl;
import com.swart.scryfallfluentapi.query.sets.SetsInf;
import com.swart.scryfallfluentapi.query.symbology.SymbologyImpl;
import com.swart.scryfallfluentapi.query.symbology.SymbologyInf;

public class Query {

  public static CardsInf cards() {
    return new CardsImpl();
  }

  public static SetsInf sets() {
    return new SetsImpl();
  }

  public static SymbologyInf symbology() {
    return new SymbologyImpl();
  }

  public static CatalogInf catalog() {
    return new CatalogImpl();
  }

}

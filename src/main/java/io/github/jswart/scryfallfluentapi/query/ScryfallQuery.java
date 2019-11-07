package io.github.jswart.scryfallfluentapi.query;

import io.github.jswart.scryfallfluentapi.query.cards.CardsImpl;
import io.github.jswart.scryfallfluentapi.query.cards.CardsInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.CatalogImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.CatalogInf;
import io.github.jswart.scryfallfluentapi.query.sets.SetsImpl;
import io.github.jswart.scryfallfluentapi.query.sets.SetsInf;
import io.github.jswart.scryfallfluentapi.query.symbology.SymbologyImpl;
import io.github.jswart.scryfallfluentapi.query.symbology.SymbologyInf;

public class ScryfallQuery {

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

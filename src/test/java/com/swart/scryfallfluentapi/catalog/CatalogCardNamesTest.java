package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogCardNamesTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().cardnames().build();
    assertEquals("https://api.scryfall.com/catalog/card-names", url);

    // default
    url = ScryfallQuery.catalog().cardnames().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/card-names", url);

    // non-default
    url = ScryfallQuery.catalog().cardnames().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/card-names?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().cardnames().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/card-names?format=json&pretty=false", url);

  }

}

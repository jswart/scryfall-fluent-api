package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogLoyaltiesTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().loyalties().build();
    assertEquals("https://api.scryfall.com/catalog/loyalties", url);

    // default
    url = ScryfallQuery.catalog().loyalties().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/loyalties", url);

    // non-default
    url = ScryfallQuery.catalog().loyalties().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/loyalties?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().loyalties().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/loyalties?format=json&pretty=false", url);

  }

}

package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogPowersTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().powers().build();
    assertEquals("https://api.scryfall.com/catalog/powers", url);

    // default
    url = ScryfallQuery.catalog().powers().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/powers", url);

    // non-default
    url = ScryfallQuery.catalog().powers().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/powers?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().powers().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/powers?format=json&pretty=false", url);

  }

}

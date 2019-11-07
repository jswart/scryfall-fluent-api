package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogToughnessTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().toughness().build();
    assertEquals("https://api.scryfall.com/catalog/toughness", url);

    // default
    url = ScryfallQuery.catalog().toughness().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/toughness", url);

    // non-default
    url = ScryfallQuery.catalog().toughness().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/toughness?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().toughness().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/toughness?format=json&pretty=false", url);

  }

}

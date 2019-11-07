package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogCreatureTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().creaturetypes().build();
    assertEquals("https://api.scryfall.com/catalog/creature-types", url);

    // default
    url = ScryfallQuery.catalog().creaturetypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/creature-types", url);

    // non-default
    url = ScryfallQuery.catalog().creaturetypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/creature-types?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().creaturetypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/creature-types?format=json&pretty=false", url);

  }

}

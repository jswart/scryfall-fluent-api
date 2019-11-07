package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class CatalogCreatureTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().creaturetypes().build();
    assertEquals("https://api.scryfall.com/catalog/creature-types", url);

    // default
    url = Query.catalog().creaturetypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/creature-types", url);

    // non-default
    url = Query.catalog().creaturetypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/creature-types?pretty=true", url);

    // verbose
    url = Query.catalog().creaturetypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/creature-types?format=json&pretty=false", url);

  }

}

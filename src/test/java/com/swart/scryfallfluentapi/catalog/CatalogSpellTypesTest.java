package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogSpellTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().spelltypes().build();
    assertEquals("https://api.scryfall.com/catalog/spell-types", url);

    // default
    url = ScryfallQuery.catalog().spelltypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/spell-types", url);

    // non-default
    url = ScryfallQuery.catalog().spelltypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/spell-types?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().spelltypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/spell-types?format=json&pretty=false", url);

  }

}

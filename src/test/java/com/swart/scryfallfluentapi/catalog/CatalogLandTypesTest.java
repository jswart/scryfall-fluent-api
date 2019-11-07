package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogLandTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().landtypes().build();
    assertEquals("https://api.scryfall.com/catalog/land-types", url);

    // default
    url = ScryfallQuery.catalog().landtypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/land-types", url);

    // non-default
    url = ScryfallQuery.catalog().landtypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/land-types?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().landtypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/land-types?format=json&pretty=false", url);

  }

}

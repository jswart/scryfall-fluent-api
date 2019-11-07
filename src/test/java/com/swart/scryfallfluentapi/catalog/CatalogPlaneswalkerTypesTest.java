package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogPlaneswalkerTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().planeswalkertypes().build();
    assertEquals("https://api.scryfall.com/catalog/planeswalker-types", url);

    // default
    url = ScryfallQuery.catalog().planeswalkertypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/planeswalker-types", url);

    // non-default
    url = ScryfallQuery.catalog().planeswalkertypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/planeswalker-types?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().planeswalkertypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/planeswalker-types?format=json&pretty=false", url);

  }

}

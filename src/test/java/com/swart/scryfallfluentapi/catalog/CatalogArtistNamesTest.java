package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogArtistNamesTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().artistnames().build();
    assertEquals("https://api.scryfall.com/catalog/artist-names", url);

    // default
    url = ScryfallQuery.catalog().artistnames().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/artist-names", url);

    // non-default
    url = ScryfallQuery.catalog().artistnames().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/artist-names?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().artistnames().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/artist-names?format=json&pretty=false", url);

  }

}

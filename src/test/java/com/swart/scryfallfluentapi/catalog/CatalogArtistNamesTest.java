package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class CatalogArtistNamesTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().artistnames().build();
    assertEquals("https://api.scryfall.com/catalog/artist-names", url);

    // default
    url = Query.catalog().artistnames().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/artist-names", url);

    // non-default
    url = Query.catalog().artistnames().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/artist-names?pretty=true", url);

    // verbose
    url = Query.catalog().artistnames().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/artist-names?format=json&pretty=false", url);

  }

}

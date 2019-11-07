package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogWatermarksTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().watermarks().build();
    assertEquals("https://api.scryfall.com/catalog/watermarks", url);

    // default
    url = ScryfallQuery.catalog().watermarks().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/watermarks", url);

    // non-default
    url = ScryfallQuery.catalog().watermarks().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/watermarks?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().watermarks().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/watermarks?format=json&pretty=false", url);

  }

}

package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class CatalogWatermarksTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().watermarks().build();
    assertEquals("https://api.scryfall.com/catalog/watermarks", url);

    // default
    url = Query.catalog().watermarks().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/watermarks", url);

    // non-default
    url = Query.catalog().watermarks().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/watermarks?pretty=true", url);

    // verbose
    url = Query.catalog().watermarks().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/watermarks?format=json&pretty=false", url);

  }

}

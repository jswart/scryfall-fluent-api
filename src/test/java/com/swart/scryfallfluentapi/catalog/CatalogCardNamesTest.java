package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class CatalogCardNamesTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().cardnames().build();
    assertEquals("https://api.scryfall.com/catalog/card-names", url);

    // default
    url = Query.catalog().cardnames().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/card-names", url);

    // non-default
    url = Query.catalog().cardnames().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/card-names?pretty=true", url);

    // verbose
    url = Query.catalog().cardnames().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/card-names?format=json&pretty=false", url);

  }

}

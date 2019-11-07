package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class CatalogToughnessTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().toughness().build();
    assertEquals("https://api.scryfall.com/catalog/toughness", url);

    // default
    url = Query.catalog().toughness().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/toughness", url);

    // non-default
    url = Query.catalog().toughness().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/toughness?pretty=true", url);

    // verbose
    url = Query.catalog().toughness().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/toughness?format=json&pretty=false", url);

  }

}

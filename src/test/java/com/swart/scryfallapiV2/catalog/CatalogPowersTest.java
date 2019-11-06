package com.swart.scryfallapiV2.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class CatalogPowersTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().powers().build();
    assertEquals("https://api.scryfall.com/catalog/powers", url);

    // default
    url = Query.catalog().powers().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/powers", url);

    // non-default
    url = Query.catalog().powers().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/powers?pretty=true", url);

    // verbose
    url = Query.catalog().powers().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/powers?format=json&pretty=false", url);

  }

}

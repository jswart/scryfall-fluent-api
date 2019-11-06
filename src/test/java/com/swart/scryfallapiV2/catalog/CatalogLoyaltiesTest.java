package com.swart.scryfallapiV2.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class CatalogLoyaltiesTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().loyalties().build();
    assertEquals("https://api.scryfall.com/catalog/loyalties", url);

    // default
    url = Query.catalog().loyalties().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/loyalties", url);

    // non-default
    url = Query.catalog().loyalties().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/loyalties?pretty=true", url);

    // verbose
    url = Query.catalog().loyalties().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/loyalties?format=json&pretty=false", url);

  }

}

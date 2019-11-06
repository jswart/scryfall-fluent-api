package com.swart.scryfallapiV2.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class CatalogPlaneswalkerTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().planeswalkertypes().build();
    assertEquals("https://api.scryfall.com/catalog/planeswalker-types", url);

    // default
    url = Query.catalog().planeswalkertypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/planeswalker-types", url);

    // non-default
    url = Query.catalog().planeswalkertypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/planeswalker-types?pretty=true", url);

    // verbose
    url = Query.catalog().planeswalkertypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/planeswalker-types?format=json&pretty=false", url);

  }

}

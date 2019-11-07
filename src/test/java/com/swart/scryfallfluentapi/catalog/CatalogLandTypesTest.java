package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class CatalogLandTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().landtypes().build();
    assertEquals("https://api.scryfall.com/catalog/land-types", url);

    // default
    url = Query.catalog().landtypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/land-types", url);

    // non-default
    url = Query.catalog().landtypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/land-types?pretty=true", url);

    // verbose
    url = Query.catalog().landtypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/land-types?format=json&pretty=false", url);

  }

}

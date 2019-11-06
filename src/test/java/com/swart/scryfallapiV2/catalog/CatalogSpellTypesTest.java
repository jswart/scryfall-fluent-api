package com.swart.scryfallapiV2.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class CatalogSpellTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().spelltypes().build();
    assertEquals("https://api.scryfall.com/catalog/spell-types", url);

    // default
    url = Query.catalog().spelltypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/spell-types", url);

    // non-default
    url = Query.catalog().spelltypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/spell-types?pretty=true", url);

    // verbose
    url = Query.catalog().spelltypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/spell-types?format=json&pretty=false", url);

  }

}
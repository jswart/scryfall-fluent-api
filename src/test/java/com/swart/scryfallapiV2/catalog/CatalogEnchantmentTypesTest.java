package com.swart.scryfallapiV2.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class CatalogEnchantmentTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().enchantmenttypes().build();
    assertEquals("https://api.scryfall.com/catalog/enchantment-types", url);

    // default
    url = Query.catalog().enchantmenttypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/enchantment-types", url);

    // non-default
    url = Query.catalog().enchantmenttypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/enchantment-types?pretty=true", url);

    // verbose
    url = Query.catalog().enchantmenttypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/enchantment-types?format=json&pretty=false", url);

  }

}

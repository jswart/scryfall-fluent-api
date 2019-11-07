package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogEnchantmentTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().enchantmenttypes().build();
    assertEquals("https://api.scryfall.com/catalog/enchantment-types", url);

    // default
    url = ScryfallQuery.catalog().enchantmenttypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/enchantment-types", url);

    // non-default
    url = ScryfallQuery.catalog().enchantmenttypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/enchantment-types?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().enchantmenttypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/enchantment-types?format=json&pretty=false", url);

  }

}

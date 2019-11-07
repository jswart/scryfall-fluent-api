package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogWordBankTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().wordbank().build();
    assertEquals("https://api.scryfall.com/catalog/word-bank", url);

    // default
    url = ScryfallQuery.catalog().wordbank().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/word-bank", url);

    // non-default
    url = ScryfallQuery.catalog().wordbank().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/word-bank?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().wordbank().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/word-bank?format=json&pretty=false", url);

  }

}

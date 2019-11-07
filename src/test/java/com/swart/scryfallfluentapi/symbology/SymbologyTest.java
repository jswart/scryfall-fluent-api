package com.swart.scryfallfluentapi.symbology;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class SymbologyTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.symbology().build();
    assertEquals("https://api.scryfall.com/symbology", url);

    // default
    url = ScryfallQuery.symbology().withFormat().json().build();
    assertEquals("https://api.scryfall.com/symbology", url);

    // non-default
    url = ScryfallQuery.symbology().withPretty().build();
    assertEquals("https://api.scryfall.com/symbology?pretty=true", url);

    // verbose
    url = ScryfallQuery.symbology().buildVerbose();
    assertEquals("https://api.scryfall.com/symbology?format=json&pretty=false", url);

  }

}

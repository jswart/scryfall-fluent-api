package com.swart.scryfallfluentapi.symbology;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class SymbologyTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.symbology().build();
    assertEquals("https://api.scryfall.com/symbology", url);

    // default
    url = Query.symbology().withFormat().json().build();
    assertEquals("https://api.scryfall.com/symbology", url);

    // non-default
    url = Query.symbology().withPretty().build();
    assertEquals("https://api.scryfall.com/symbology?pretty=true", url);

    // verbose
    url = Query.symbology().buildVerbose();
    assertEquals("https://api.scryfall.com/symbology?format=json&pretty=false", url);

  }

}

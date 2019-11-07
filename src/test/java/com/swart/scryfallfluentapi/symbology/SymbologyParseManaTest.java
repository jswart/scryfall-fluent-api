package com.swart.scryfallfluentapi.symbology;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class SymbologyParseManaTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = Query.symbology().parsemana().build();
      assert (false); // id must be defined
    } catch (final Exception e) {
    }

    // minimum required options
    url = Query.symbology().parsemana().withCost("abc-123").build();
    assertEquals("https://api.scryfall.com/symbology/parse-mana?cost=abc-123", url);

    // default
    url = Query.symbology().parsemana().withCost("abc-123").withFormat().json().build();
    assertEquals("https://api.scryfall.com/symbology/parse-mana?cost=abc-123", url);

    // non-default
    url = Query.symbology().parsemana().withCost("abc-123").withPretty().build();
    assertEquals("https://api.scryfall.com/symbology/parse-mana?cost=abc-123&pretty=true", url);

  }

}

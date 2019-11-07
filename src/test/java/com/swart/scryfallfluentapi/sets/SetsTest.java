package com.swart.scryfallfluentapi.sets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class SetsTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.sets().build();
    assertEquals("https://api.scryfall.com/sets", url);

    // default
    url = ScryfallQuery.sets().withFormat().json().build();
    assertEquals("https://api.scryfall.com/sets", url);

    // non-default
    url = ScryfallQuery.sets().withPretty().build();
    assertEquals("https://api.scryfall.com/sets?pretty=true", url);

    // verbose
    url = ScryfallQuery.sets().buildVerbose();
    assertEquals("https://api.scryfall.com/sets?format=json&pretty=false", url);

  }

}

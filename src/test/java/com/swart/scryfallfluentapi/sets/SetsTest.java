package com.swart.scryfallfluentapi.sets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class SetsTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.sets().build();
    assertEquals("https://api.scryfall.com/sets", url);

    // default
    url = Query.sets().withFormat().json().build();
    assertEquals("https://api.scryfall.com/sets", url);

    // non-default
    url = Query.sets().withPretty().build();
    assertEquals("https://api.scryfall.com/sets?pretty=true", url);

    // verbose
    url = Query.sets().buildVerbose();
    assertEquals("https://api.scryfall.com/sets?format=json&pretty=false", url);

  }

}

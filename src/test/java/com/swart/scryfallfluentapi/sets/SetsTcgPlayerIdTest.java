package com.swart.scryfallfluentapi.sets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class SetsTcgPlayerIdTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = ScryfallQuery.sets().tcgplayerId().build();
      assert (false); // set must be defined
    } catch (final Exception e) {
    }

    // bad options
    try {
      url = ScryfallQuery.sets().tcgplayerId().withId(0).build();
      assert (false); // id must be great than 1
    } catch (final Exception e) {
    }

    // minimum required options
    url = ScryfallQuery.sets().tcgplayerId().withId(4).build();
    assertEquals("https://api.scryfall.com/sets/tcgplayer/4", url);

    // default
    url = ScryfallQuery.sets().tcgplayerId().withId(4).withFormat().json().build();
    assertEquals("https://api.scryfall.com/sets/tcgplayer/4", url);

    // non-default
    url = ScryfallQuery.sets().tcgplayerId().withId(4).withPretty().build();
    assertEquals("https://api.scryfall.com/sets/tcgplayer/4?pretty=true", url);

  }

}

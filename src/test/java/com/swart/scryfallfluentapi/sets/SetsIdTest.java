package com.swart.scryfallfluentapi.sets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class SetsIdTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = ScryfallQuery.sets().id().build();
      assert (false); // id must be defined
    } catch (final Exception e) {
    }

    // minimum required options
    url = ScryfallQuery.sets().id().withId("abc-123").build();
    assertEquals("https://api.scryfall.com/sets/abc-123", url);

    // default
    url = ScryfallQuery.sets().id().withId("abc-123").withFormat().json().build();
    assertEquals("https://api.scryfall.com/sets/abc-123", url);

    // non-default
    url = ScryfallQuery.sets().id().withId("abc-123").withPretty().build();
    assertEquals("https://api.scryfall.com/sets/abc-123?pretty=true", url);

  }

}

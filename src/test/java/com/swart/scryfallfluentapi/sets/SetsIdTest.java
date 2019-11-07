package com.swart.scryfallfluentapi.sets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class SetsIdTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = Query.sets().id().build();
      assert (false); // id must be defined
    } catch (final Exception e) {
    }

    // minimum required options
    url = Query.sets().id().withId("abc-123").build();
    assertEquals("https://api.scryfall.com/sets/abc-123", url);

    // default
    url = Query.sets().id().withId("abc-123").withFormat().json().build();
    assertEquals("https://api.scryfall.com/sets/abc-123", url);

    // non-default
    url = Query.sets().id().withId("abc-123").withPretty().build();
    assertEquals("https://api.scryfall.com/sets/abc-123?pretty=true", url);

  }

}

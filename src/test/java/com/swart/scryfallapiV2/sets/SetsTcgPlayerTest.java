package com.swart.scryfallapiV2.sets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class SetsTcgPlayerTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = Query.sets().tcgplayerId().build();
      assert (false); // set must be defined
    } catch (final Exception e) {
    }

    // bad options
    try {
      url = Query.sets().tcgplayerId().withId(0).build();
      assert (false); // id must be great than 1
    } catch (final Exception e) {
    }

    // minimum required options
    url = Query.sets().tcgplayerId().withId(4).build();
    assertEquals("https://api.scryfall.com/sets/tcgplayer/4", url);

    // default
    url = Query.sets().tcgplayerId().withId(4).withFormat().json().build();
    assertEquals("https://api.scryfall.com/sets/tcgplayer/4", url);

    // non-default
    url = Query.sets().tcgplayerId().withId(4).withPretty().build();
    assertEquals("https://api.scryfall.com/sets/tcgplayer/4?pretty=true", url);

  }

}

package com.swart.scryfallapiV2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class CardsTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.cards().build();
    assertEquals("https://api.scryfall.com/cards", url);

    // default
    url = Query.cards().withPage(1).build();
    assertEquals("https://api.scryfall.com/cards", url);
    // non-default
    url = Query.cards().withPage(2).build();
    assertEquals("https://api.scryfall.com/cards?page=2", url);

    // default
    url = Query.cards().withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards", url);

    // non-default
    url = Query.cards().withPretty().build();
    assertEquals("https://api.scryfall.com/cards?pretty=true", url);

    // verbose
    url = Query.cards().buildVerbose();
    assertEquals("https://api.scryfall.com/cards?page=1&format=json&pretty=false", url);

  }

}

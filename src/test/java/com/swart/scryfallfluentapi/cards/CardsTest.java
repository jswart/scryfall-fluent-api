package com.swart.scryfallfluentapi.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CardsTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.cards().build();
    assertEquals("https://api.scryfall.com/cards", url);

    // default
    url = ScryfallQuery.cards().withPage(1).build();
    assertEquals("https://api.scryfall.com/cards", url);
    // non-default
    url = ScryfallQuery.cards().withPage(2).build();
    assertEquals("https://api.scryfall.com/cards?page=2", url);

    // default
    url = ScryfallQuery.cards().withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards", url);

    // non-default
    url = ScryfallQuery.cards().withPretty().build();
    assertEquals("https://api.scryfall.com/cards?pretty=true", url);

    // verbose
    url = ScryfallQuery.cards().buildVerbose();
    assertEquals("https://api.scryfall.com/cards?page=1&format=json&pretty=false", url);

  }

}

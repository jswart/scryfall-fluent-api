package com.swart.scryfallfluentapi.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CardsAutoCompleteTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = ScryfallQuery.cards().autocomplete().build();
      assert (false); // fuzzy or exact must be defined
    } catch (final Exception e) {
    }

    // exact
    url = ScryfallQuery.cards().autocomplete().withQuery("test string").build();
    assertEquals("https://api.scryfall.com/cards/autocomplete?q=test+string", url);

    // default
    url = ScryfallQuery.cards().autocomplete().withQuery("abc123").withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/autocomplete?q=abc123", url);

    // non-default
    url = ScryfallQuery.cards().autocomplete().withQuery("abc123").withPretty().build();
    assertEquals("https://api.scryfall.com/cards/autocomplete?q=abc123&pretty=true", url);

    // verbose
    url = ScryfallQuery.cards().autocomplete().withQuery("abc123").buildVerbose();
    assertEquals("https://api.scryfall.com/cards/autocomplete?q=abc123&format=json&pretty=false", url);

  }

}

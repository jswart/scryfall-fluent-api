package com.swart.scryfallapiV2.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class CardsAutoCompleteTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = Query.cards().autocomplete().build();
      assert (false); // fuzzy or exact must be defined
    } catch (final Exception e) {
    }

    // exact
    url = Query.cards().autocomplete().withQuery("test string").build();
    assertEquals("https://api.scryfall.com/cards/autocomplete?q=test+string", url);

    // default
    url = Query.cards().autocomplete().withQuery("abc123").withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/autocomplete?q=abc123", url);

    // non-default
    url = Query.cards().autocomplete().withQuery("abc123").withPretty().build();
    assertEquals("https://api.scryfall.com/cards/autocomplete?q=abc123&pretty=true", url);

    // verbose
    url = Query.cards().autocomplete().withQuery("abc123").buildVerbose();
    assertEquals("https://api.scryfall.com/cards/autocomplete?q=abc123&format=json&pretty=false", url);

  }

}

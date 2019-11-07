package com.swart.scryfallfluentapi.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CardsCollectionTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = ScryfallQuery.cards().collection().build();
    } catch (final Exception e) {
      assert (false);
    }

    // exact
    url = ScryfallQuery.cards().collection().build();
    assertEquals("https://api.scryfall.com/cards/collection", url);

    // non-default
    url = ScryfallQuery.cards().collection().withPretty().build();
    assertEquals("https://api.scryfall.com/cards/collection?pretty=true", url);

    // verbose
    url = ScryfallQuery.cards().collection().buildVerbose();
    assertEquals("https://api.scryfall.com/cards/collection?pretty=false", url);

  }

}

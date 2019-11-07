package com.swart.scryfallfluentapi.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class CardsCollectionTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = Query.cards().collection().build();
    } catch (final Exception e) {
      assert (false);
    }

    // exact
    url = Query.cards().collection().build();
    assertEquals("https://api.scryfall.com/cards/collection", url);

    // non-default
    url = Query.cards().collection().withPretty().build();
    assertEquals("https://api.scryfall.com/cards/collection?pretty=true", url);

    // verbose
    url = Query.cards().collection().buildVerbose();
    assertEquals("https://api.scryfall.com/cards/collection?pretty=false", url);

  }

}

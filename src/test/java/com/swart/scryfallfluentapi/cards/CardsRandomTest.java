package com.swart.scryfallfluentapi.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CardsRandomTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = ScryfallQuery.cards().random().build();
      assert (false); // q must be defined
    } catch (final Exception e) {
    }

    // exact
    url = ScryfallQuery.cards().random().withQuery("test string").build();
    assertEquals("https://api.scryfall.com/cards/random?q=test+string", url);

    // default
    url = ScryfallQuery.cards().random().withQuery("abc123").withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123", url);

    // default
    url = ScryfallQuery.cards().random().withQuery("abc123").withFace().front().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123", url);
    // non-default
    url = ScryfallQuery.cards().random().withQuery("abc123").withFace().back().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123&face=back", url);

    // default
    url = ScryfallQuery.cards().random().withQuery("abc123").withVersion().large().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123", url);
    // non-default
    url = ScryfallQuery.cards().random().withQuery("abc123").withVersion().small().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123&version=small", url);
    url = ScryfallQuery.cards().random().withQuery("abc123").withVersion().normal().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123&version=normal", url);
    url = ScryfallQuery.cards().random().withQuery("abc123").withVersion().artCrop().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123&version=art_crop", url);
    url = ScryfallQuery.cards().random().withQuery("abc123").withVersion().borderCrop().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123&version=border_crop", url);
    url = ScryfallQuery.cards().random().withQuery("abc123").withVersion().png().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123&version=png", url);

    // non-default
    url = ScryfallQuery.cards().random().withQuery("abc123").withPretty().build();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123&pretty=true", url);

    // verbose
    url = ScryfallQuery.cards().random().withQuery("abc123").buildVerbose();
    assertEquals("https://api.scryfall.com/cards/random?q=abc123&format=json&face=front&version=large&pretty=false",
        url);

  }

}

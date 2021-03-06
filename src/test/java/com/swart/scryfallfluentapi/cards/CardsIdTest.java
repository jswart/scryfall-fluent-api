package com.swart.scryfallfluentapi.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CardsIdTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = ScryfallQuery.cards().id().build();
      assert (false); // id must be defined
    } catch (final Exception e) {
    }

    // minimum required options
    url = ScryfallQuery.cards().id().withId("abc-123").build();
    assertEquals("https://api.scryfall.com/cards/abc-123", url);

    // default
    url = ScryfallQuery.cards().id().withId("abc-123").withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/abc-123", url);
    // non-default
    url = ScryfallQuery.cards().id().withId("abc-123").withFormat().image().build();
    assertEquals("https://api.scryfall.com/cards/abc-123?format=image", url);
    url = ScryfallQuery.cards().id().withId("abc-123").withFormat().text().build();
    assertEquals("https://api.scryfall.com/cards/abc-123?format=text", url);

    // default
    url = ScryfallQuery.cards().id().withId("abc-123").withFace().front().build();
    assertEquals("https://api.scryfall.com/cards/abc-123", url);
    // non-default
    url = ScryfallQuery.cards().id().withId("abc-123").withFace().back().build();
    assertEquals("https://api.scryfall.com/cards/abc-123?face=back", url);

    // default
    url = ScryfallQuery.cards().id().withId("abc-123").withVersion().large().build();
    assertEquals("https://api.scryfall.com/cards/abc-123", url);
    // non-default
    url = ScryfallQuery.cards().id().withId("abc-123").withVersion().small().build();
    assertEquals("https://api.scryfall.com/cards/abc-123?version=small", url);
    url = ScryfallQuery.cards().id().withId("abc-123").withVersion().normal().build();
    assertEquals("https://api.scryfall.com/cards/abc-123?version=normal", url);
    url = ScryfallQuery.cards().id().withId("abc-123").withVersion().artCrop().build();
    assertEquals("https://api.scryfall.com/cards/abc-123?version=art_crop", url);
    url = ScryfallQuery.cards().id().withId("abc-123").withVersion().borderCrop().build();
    assertEquals("https://api.scryfall.com/cards/abc-123?version=border_crop", url);
    url = ScryfallQuery.cards().id().withId("abc-123").withVersion().png().build();
    assertEquals("https://api.scryfall.com/cards/abc-123?version=png", url);

    // non-default
    url = ScryfallQuery.cards().id().withId("abc-123").withPretty().build();
    assertEquals("https://api.scryfall.com/cards/abc-123?pretty=true", url);

    // non-default
    url = ScryfallQuery.cards().id().withId("abc-123").withRulings().build();
    assertEquals("https://api.scryfall.com/cards/abc-123/rulings", url);

  }

}

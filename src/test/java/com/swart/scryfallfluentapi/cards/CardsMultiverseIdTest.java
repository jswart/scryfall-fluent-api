package com.swart.scryfallfluentapi.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class CardsMultiverseIdTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = Query.cards().multiverseId().build();
      assert (false); // set must be defined
    } catch (final Exception e) {
    }

    // bad options
    try {
      url = Query.cards().multiverseId().withId(0).build();
      assert (false); // id must be great than 1
    } catch (final Exception e) {
    }

    // minimum required options
    url = Query.cards().multiverseId().withId(4).build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4", url);

    // default
    url = Query.cards().multiverseId().withId(4).withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4", url);
    // non-default
    url = Query.cards().multiverseId().withId(4).withFormat().image().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4?format=image", url);
    url = Query.cards().multiverseId().withId(4).withFormat().text().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4?format=text", url);

    // default
    url = Query.cards().multiverseId().withId(4).withFace().front().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4", url);
    // non-default
    url = Query.cards().multiverseId().withId(4).withFace().back().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4?face=back", url);

    // default
    url = Query.cards().multiverseId().withId(4).withVersion().large().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4", url);
    // non-default
    url = Query.cards().multiverseId().withId(4).withVersion().small().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4?version=small", url);
    url = Query.cards().multiverseId().withId(4).withVersion().normal().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4?version=normal", url);
    url = Query.cards().multiverseId().withId(4).withVersion().artCrop().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4?version=art_crop", url);
    url = Query.cards().multiverseId().withId(4).withVersion().borderCrop().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4?version=border_crop", url);
    url = Query.cards().multiverseId().withId(4).withVersion().png().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4?version=png", url);

    // non-default
    url = Query.cards().multiverseId().withId(4).withPretty().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4?pretty=true", url);

    // non-default
    url = Query.cards().multiverseId().withId(4).withRulings().build();
    assertEquals("https://api.scryfall.com/cards/multiverse/4/rulings", url);

  }

}

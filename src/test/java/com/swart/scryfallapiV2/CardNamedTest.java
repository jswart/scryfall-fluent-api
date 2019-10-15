package com.swart.scryfallapiV2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

public class CardNamedTest {

  @Test
  public void fluentSearch() {

    String url = "";

    // no options
    try {
      url = Query.cards().named().build();
      assert (false); // fuzzy or exact must be defined
    } catch (final Exception e) {
    }

    // exact
    url = Query.cards().named().withExact("test string").build();
    assertEquals("https://api.scryfall.com/cards/named?exact=test+string", url);

    // fuzzy
    url = Query.cards().named().withFuzzy("test string").build();
    assertEquals("https://api.scryfall.com/cards/named?fuzzy=test+string", url);

    // default
    url = Query.cards().named().withExact("abc123").withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123", url);
    // non-default
    url = Query.cards().named().withExact("abc123").withFormat().image().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&format=image", url);
    url = Query.cards().named().withExact("abc123").withFormat().text().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&format=text", url);

    // default
    url = Query.cards().named().withExact("abc123").withFace().front().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123", url);
    // non-default
    url = Query.cards().named().withExact("abc123").withFace().back().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&face=back", url);

    // default
    url = Query.cards().named().withExact("abc123").withVersion().large().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123", url);
    // non-default
    url = Query.cards().named().withExact("abc123").withVersion().small().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=small", url);
    url = Query.cards().named().withExact("abc123").withVersion().normal().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=normal", url);
    url = Query.cards().named().withExact("abc123").withVersion().artCrop().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=art_crop", url);
    url = Query.cards().named().withExact("abc123").withVersion().borderCrop().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=border_crop", url);
    url = Query.cards().named().withExact("abc123").withVersion().png().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=png", url);

    // non-default
    url = Query.cards().named().withExact("abc123").withPretty().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&pretty=true", url);

    // verbose
    url = Query.cards().named().withExact("abc123").withFuzzy("").buildVerbose();
    assertEquals(
        "https://api.scryfall.com/cards/named?exact=abc123&fuzzy=&format=json&face=front&version=large&pretty=false",
        url);

  }

}

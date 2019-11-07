package com.swart.scryfallfluentapi.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.model.SetDBEnum;
import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CardsNamedTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = ScryfallQuery.cards().named().build();
      assert (false); // fuzzy or exact must be defined
    } catch (final Exception e) {
    }

    // exact
    url = ScryfallQuery.cards().named().withExact("test string").build();
    assertEquals("https://api.scryfall.com/cards/named?exact=test+string", url);

    // fuzzy
    url = ScryfallQuery.cards().named().withFuzzy("test string").build();
    assertEquals("https://api.scryfall.com/cards/named?fuzzy=test+string", url);

    // default
    url = ScryfallQuery.cards().named().withExact("abc123").withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123", url);
    // non-default
    url = ScryfallQuery.cards().named().withExact("abc123").withFormat().image().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&format=image", url);
    url = ScryfallQuery.cards().named().withExact("abc123").withFormat().text().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&format=text", url);

    url = ScryfallQuery.cards().named().withExact("abc123").withSet(SetDBEnum.AetherRevolt).build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&set=aer", url);

    // default
    url = ScryfallQuery.cards().named().withExact("abc123").withFace().front().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123", url);
    // non-default
    url = ScryfallQuery.cards().named().withExact("abc123").withFace().back().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&face=back", url);

    // default
    url = ScryfallQuery.cards().named().withExact("abc123").withVersion().large().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123", url);
    // non-default
    url = ScryfallQuery.cards().named().withExact("abc123").withVersion().small().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=small", url);
    url = ScryfallQuery.cards().named().withExact("abc123").withVersion().normal().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=normal", url);
    url = ScryfallQuery.cards().named().withExact("abc123").withVersion().artCrop().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=art_crop", url);
    url = ScryfallQuery.cards().named().withExact("abc123").withVersion().borderCrop().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=border_crop", url);
    url = ScryfallQuery.cards().named().withExact("abc123").withVersion().png().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&version=png", url);

    // non-default
    url = ScryfallQuery.cards().named().withExact("abc123").withPretty().build();
    assertEquals("https://api.scryfall.com/cards/named?exact=abc123&pretty=true", url);

    // verbose
    url = ScryfallQuery.cards().named().withExact("abc123").withFuzzy("").buildVerbose();
    assertEquals(
        "https://api.scryfall.com/cards/named?exact=abc123&fuzzy=&format=json&face=front&version=large&pretty=false",
        url);

  }

}

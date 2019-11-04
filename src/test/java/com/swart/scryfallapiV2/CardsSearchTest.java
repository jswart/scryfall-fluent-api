package com.swart.scryfallapiV2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class CardsSearchTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.cards().search().build();
    assertEquals("https://api.scryfall.com/cards/search", url);

    // query
    url = Query.cards().search().withQuery("testquery withspace").build();
    assertEquals("https://api.scryfall.com/cards/search?q=testquery+withspace", url);

    // default
    url = Query.cards().search().withUnique().cards().build();
    assertEquals("https://api.scryfall.com/cards/search", url);
    // non-default
    url = Query.cards().search().withUnique().art().build();
    assertEquals("https://api.scryfall.com/cards/search?unique=art", url);
    url = Query.cards().search().withUnique().prints().build();
    assertEquals("https://api.scryfall.com/cards/search?unique=prints", url);

    // default
    url = Query.cards().search().withOrder().name().build();
    assertEquals("https://api.scryfall.com/cards/search", url);
    // non-default
    url = Query.cards().search().withOrder().artist().build();
    assertEquals("https://api.scryfall.com/cards/search?order=artist", url);
    url = Query.cards().search().withOrder().cmc().build();
    assertEquals("https://api.scryfall.com/cards/search?order=cmc", url);
    url = Query.cards().search().withOrder().color().build();
    assertEquals("https://api.scryfall.com/cards/search?order=color", url);
    url = Query.cards().search().withOrder().edhrec().build();
    assertEquals("https://api.scryfall.com/cards/search?order=edhrec", url);
    url = Query.cards().search().withOrder().eur().build();
    assertEquals("https://api.scryfall.com/cards/search?order=eur", url);
    url = Query.cards().search().withOrder().power().build();
    assertEquals("https://api.scryfall.com/cards/search?order=power", url);
    url = Query.cards().search().withOrder().rarity().build();
    assertEquals("https://api.scryfall.com/cards/search?order=rarity", url);
    url = Query.cards().search().withOrder().released().build();
    assertEquals("https://api.scryfall.com/cards/search?order=released", url);
    url = Query.cards().search().withOrder().set().build();
    assertEquals("https://api.scryfall.com/cards/search?order=set", url);
    url = Query.cards().search().withOrder().ti().build();
    assertEquals("https://api.scryfall.com/cards/search?order=ti", url);
    url = Query.cards().search().withOrder().toughness().build();
    assertEquals("https://api.scryfall.com/cards/search?order=toughness", url);
    url = Query.cards().search().withOrder().usd().build();
    assertEquals("https://api.scryfall.com/cards/search?order=usd", url);

    // default
    url = Query.cards().search().withDirection().auto().build();
    assertEquals("https://api.scryfall.com/cards/search", url);
    // non-default
    url = Query.cards().search().withDirection().asc().build();
    assertEquals("https://api.scryfall.com/cards/search?dir=asc", url);
    url = Query.cards().search().withDirection().desc().build();
    assertEquals("https://api.scryfall.com/cards/search?dir=desc", url);

    // non-default
    url = Query.cards().search().withIncludeExtras().build();
    assertEquals("https://api.scryfall.com/cards/search?include_extras=true", url);

    // non-default
    url = Query.cards().search().withIncludeMultilingual().build();
    assertEquals("https://api.scryfall.com/cards/search?include_multilingual=true", url);

    // non-default
    url = Query.cards().search().withIncludeVariations().build();
    assertEquals("https://api.scryfall.com/cards/search?include_variations=true", url);

    // default
    url = Query.cards().search().withPage(1).build();
    assertEquals("https://api.scryfall.com/cards/search", url);
    // non-default
    url = Query.cards().search().withPage(2).build();
    assertEquals("https://api.scryfall.com/cards/search?page=2", url);

    // default
    url = Query.cards().search().withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/search", url);
    // non-default
    url = Query.cards().search().withFormat().csv().build();
    assertEquals("https://api.scryfall.com/cards/search?format=csv", url);

    // non-default
    url = Query.cards().search().withPretty().build();
    assertEquals("https://api.scryfall.com/cards/search?pretty=true", url);

    // verbose
    url = Query.cards().search().buildVerbose();
    assertEquals(
        "https://api.scryfall.com/cards/search?unique=cards&order=name&dir=auto&include_extras=false&include_multilingual=false&include_variations=false&page=1&format=json&pretty=false",
        url);

  }

}

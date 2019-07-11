package com.swart.scryfallapiV2.query.search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

public class CardSearchTest {

  @Test
  public void fluentSearch() {
    final String url = Query.cards().search().build();

    System.out.println(url);
    assertEquals("https://api.scryfall.com/cards/search", url);

    Query.cards().search().buildVerboseUrl();
  }

}

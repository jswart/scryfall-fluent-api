package com.swart.scryfallapiV2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

public class CardAutoCompleteTest {

  @Test
  public void fluentSearch() {

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

//  private List<String> from() {
//
//    final List<String> params = new ArrayList<String>();
//
//    if (!exact.isEmpty()) {
//      params.add(String.format("q=%s", exact));
//    }
//    if (!fuzzy.isEmpty()) {
//      params.add(String.format("fuzzy=%s", fuzzy));
//    }
//    if (set != null) {
//      params.add(String.format("set=%s", set));
//    }
//    if (format != CardsNamedFormatEnum.JSON) {
//      params.add(String.format("format=%s", format));
//    }
//    if (face != CardsNamedFaceEnum.FRONT) {
//      params.add(String.format("face=%s", face));
//    }
//    if (version != CardsNamedVersionEnum.LARGE) {
//      params.add(String.format("version=%s", version));
//    }
//    if (pretty) {
//      params.add(String.format("pretty=%s", this.pretty.toString()));
//    }
//
//    return params;
//  }

}

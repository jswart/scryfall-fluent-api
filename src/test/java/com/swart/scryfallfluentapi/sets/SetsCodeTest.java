package com.swart.scryfallfluentapi.sets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.model.SetDBEnum;
import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class SetsCodeTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = ScryfallQuery.sets().code().build();
      assert (false); // set must be defined
    } catch (final Exception e) {
    }

    // minimum required options
    url = ScryfallQuery.sets().code().withSet(SetDBEnum.AetherRevolt).build();
    assertEquals("https://api.scryfall.com/sets/aer", url);

    // default
    url = ScryfallQuery.sets().code().withSet(SetDBEnum.AetherRevolt).withFormat().json().build();
    assertEquals("https://api.scryfall.com/sets/aer", url);

    // non-default
    url = ScryfallQuery.sets().code().withSet(SetDBEnum.AetherRevolt).withPretty().build();
    assertEquals("https://api.scryfall.com/sets/aer?pretty=true", url);

  }

}

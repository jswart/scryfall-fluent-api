package com.swart.scryfallapiV2.sets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.model.SetDBEnum;
import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class SetsCodeTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = Query.sets().code().build();
      assert (false); // set must be defined
    } catch (final Exception e) {
    }

    // minimum required options
    url = Query.sets().code().withSet(SetDBEnum.AetherRevolt).build();
    assertEquals("https://api.scryfall.com/sets/aer", url);

    // default
    url = Query.sets().code().withSet(SetDBEnum.AetherRevolt).withFormat().json().build();
    assertEquals("https://api.scryfall.com/sets/aer", url);

    // non-default
    url = Query.sets().code().withSet(SetDBEnum.AetherRevolt).withPretty().build();
    assertEquals("https://api.scryfall.com/sets/aer?pretty=true", url);

  }

}

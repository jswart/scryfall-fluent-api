package com.swart.scryfallapiV2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallapiV2.model.SetDBEnum;
import com.swart.scryfallapiV2.query.Query;

/**
 * @author jake swart
 */
public class CardsCodeNumberTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = Query.cards().codenumber().build();
      assert (false); // set must be defined
    } catch (final Exception e) {
    }

    // missing options
    try {
      url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).build();
      assert (false); // set must be defined
    } catch (final Exception e) {
    }

    // minimum required options
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withLang().english()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);

    // default
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withLang().english()
        .withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);

    // default
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);
    // non-default
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFormat().image()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?format=image", url);
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFormat().text().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?format=text", url);

    // default
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFace().front().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);
    // non-default
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFace().back().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?face=back", url);

    // default
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().large()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);
    // non-default
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().small()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=small", url);
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().normal()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=normal", url);
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().artCrop()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=art_crop", url);
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().borderCrop()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=border_crop", url);
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().png().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=png", url);

    // non-default
    url = Query.cards().codenumber().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withPretty().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?pretty=true", url);

  }

}

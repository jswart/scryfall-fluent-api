package com.swart.scryfallfluentapi.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.model.SetDBEnum;
import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CardsCodeNumberTest {

  @Test
  public void runtTests() {

    String url = "";

    // no options
    try {
      url = ScryfallQuery.cards().codeNumberLang().build();
      assert (false); // set must be defined
    } catch (final Exception e) {
    }

    // missing options
    try {
      url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).build();
      assert (false); // set must be defined
    } catch (final Exception e) {
    }

    // minimum required options
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withLang().english()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);

    // default
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withLang().english()
        .withFormat().json().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);

    // default
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFormat().json()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);
    // non-default
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFormat().image()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?format=image", url);
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFormat().text()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?format=text", url);

    // default
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFace().front()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);
    // non-default
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withFace().back()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?face=back", url);

    // default
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().large()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en", url);
    // non-default
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().small()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=small", url);
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().normal()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=normal", url);
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().artCrop()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=art_crop", url);
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion()
        .borderCrop().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=border_crop", url);
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withVersion().png()
        .build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?version=png", url);

    // non-default
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withPretty().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/en?pretty=true", url);

    // non-default
    url = ScryfallQuery.cards().codeNumberLang().withSet(SetDBEnum.AetherRevolt).withCollectorNumber(5).withRulings().build();
    assertEquals("https://api.scryfall.com/cards/aer/5/rulings", url);

  }

}

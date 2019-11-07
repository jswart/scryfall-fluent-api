package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.jswart.scryfallfluentapi.query.ScryfallQuery;

/**
 * @author jake swart
 */
public class CatalogArtifactTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = ScryfallQuery.catalog().artifacttypes().build();
    assertEquals("https://api.scryfall.com/catalog/artifact-types", url);

    // default
    url = ScryfallQuery.catalog().artifacttypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/artifact-types", url);

    // non-default
    url = ScryfallQuery.catalog().artifacttypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/artifact-types?pretty=true", url);

    // verbose
    url = ScryfallQuery.catalog().artifacttypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/artifact-types?format=json&pretty=false", url);

  }

}

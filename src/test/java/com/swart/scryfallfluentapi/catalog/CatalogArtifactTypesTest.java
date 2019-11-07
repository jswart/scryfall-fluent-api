package com.swart.scryfallfluentapi.catalog;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swart.scryfallfluentapi.query.Query;

/**
 * @author jake swart
 */
public class CatalogArtifactTypesTest {

  @Test
  public void runtTests() {

    // no options
    String url = Query.catalog().artifacttypes().build();
    assertEquals("https://api.scryfall.com/catalog/artifact-types", url);

    // default
    url = Query.catalog().artifacttypes().withFormat().json().build();
    assertEquals("https://api.scryfall.com/catalog/artifact-types", url);

    // non-default
    url = Query.catalog().artifacttypes().withPretty().build();
    assertEquals("https://api.scryfall.com/catalog/artifact-types?pretty=true", url);

    // verbose
    url = Query.catalog().artifacttypes().buildVerbose();
    assertEquals("https://api.scryfall.com/catalog/artifact-types?format=json&pretty=false", url);

  }

}

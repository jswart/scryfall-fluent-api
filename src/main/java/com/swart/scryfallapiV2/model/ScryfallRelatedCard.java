package com.swart.scryfallapiV2.model;

import java.net.URI;

/**
 * Cards that are closely related to other cards (final because they call them
 * by name, or generate a token, or meld, etc) have a�related_cards�property
 * that contains Related Card objects.
 *
 * @author jake
 *
 */
public class ScryfallRelatedCard {

  private String id;
  private String name;
  private String object;
  private URI uri;

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getObject() {
    return object;
  }

  public void setObject(final String object) {
    this.object = object;
  }

  public URI getUri() {
    return uri;
  }

  public void setUri(final URI uri) {
    this.uri = uri;
  }

}

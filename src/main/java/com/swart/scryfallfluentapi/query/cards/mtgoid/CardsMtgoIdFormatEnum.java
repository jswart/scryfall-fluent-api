package com.swart.scryfallfluentapi.query.cards.mtgoid;

/**
 * @author jake swart
 */
public enum CardsMtgoIdFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

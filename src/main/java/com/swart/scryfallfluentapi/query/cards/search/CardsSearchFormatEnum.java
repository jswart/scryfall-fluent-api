package com.swart.scryfallfluentapi.query.cards.search;

/**
 * @author jake swart
 */
public enum CardsSearchFormatEnum {
  JSON, CSV;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

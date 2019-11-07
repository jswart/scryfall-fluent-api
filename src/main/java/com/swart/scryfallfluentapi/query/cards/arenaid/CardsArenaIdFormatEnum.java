package com.swart.scryfallfluentapi.query.cards.arenaid;

/**
 * @author jake swart
 */
public enum CardsArenaIdFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

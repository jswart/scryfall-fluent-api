package io.github.jswart.scryfallfluentapi.query.cards;

/**
 * @author jake swart
 */
public enum CardsFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

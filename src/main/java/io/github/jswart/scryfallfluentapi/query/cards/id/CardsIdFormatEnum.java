package io.github.jswart.scryfallfluentapi.query.cards.id;

/**
 * @author jake swart
 */
public enum CardsIdFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

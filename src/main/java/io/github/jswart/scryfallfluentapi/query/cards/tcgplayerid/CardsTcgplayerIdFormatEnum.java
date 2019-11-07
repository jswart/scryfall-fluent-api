package io.github.jswart.scryfallfluentapi.query.cards.tcgplayerid;

/**
 * @author jake swart
 */
public enum CardsTcgplayerIdFormatEnum {
  JSON, TEXT, IMAGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package io.github.jswart.scryfallfluentapi.query.cards.tcgplayerid;

/**
 * @author jake swart
 */
public enum CardsTcgplayerIdFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package io.github.jswart.scryfallfluentapi.query.cards.mtgoid;

/**
 * @author jake swart
 */
public enum CardsMtgoIdFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

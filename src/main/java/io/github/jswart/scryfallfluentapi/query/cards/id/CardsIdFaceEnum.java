package io.github.jswart.scryfallfluentapi.query.cards.id;

/**
 * @author jake swart
 */
public enum CardsIdFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

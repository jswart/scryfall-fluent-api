package io.github.jswart.scryfallfluentapi.query.cards.multiverseid;

/**
 * @author jake swart
 */
public enum CardsMultiverseIdFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

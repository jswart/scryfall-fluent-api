package io.github.jswart.scryfallfluentapi.query.cards.codenumber;

/**
 * @author jake swart
 */
public enum CardsCodeNumberFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

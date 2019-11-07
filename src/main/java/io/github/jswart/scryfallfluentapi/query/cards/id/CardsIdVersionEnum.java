package io.github.jswart.scryfallfluentapi.query.cards.id;

/**
 * @author jake swart
 */
public enum CardsIdVersionEnum {
  SMALL, NORMAL, LARGE, PNG, ART_CROP, BORDER_CROP;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package io.github.jswart.scryfallfluentapi.query.cards.arenaid;

/**
 * @author jake swart
 */
public enum CardsArenaIdVersionEnum {
  SMALL, NORMAL, LARGE, PNG, ART_CROP, BORDER_CROP;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

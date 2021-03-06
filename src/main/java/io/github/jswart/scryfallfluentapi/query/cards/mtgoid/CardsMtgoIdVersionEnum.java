package io.github.jswart.scryfallfluentapi.query.cards.mtgoid;

/**
 * @author jake swart
 */
public enum CardsMtgoIdVersionEnum {
  SMALL, NORMAL, LARGE, PNG, ART_CROP, BORDER_CROP;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

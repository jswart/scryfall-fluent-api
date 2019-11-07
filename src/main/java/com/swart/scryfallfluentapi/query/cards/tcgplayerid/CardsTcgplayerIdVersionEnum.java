package com.swart.scryfallfluentapi.query.cards.tcgplayerid;

/**
 * @author jake swart
 */
public enum CardsTcgplayerIdVersionEnum {
  SMALL, NORMAL, LARGE, PNG, ART_CROP, BORDER_CROP;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

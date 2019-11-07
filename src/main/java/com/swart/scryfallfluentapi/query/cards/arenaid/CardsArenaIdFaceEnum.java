package com.swart.scryfallfluentapi.query.cards.arenaid;

/**
 * @author jake swart
 */
public enum CardsArenaIdFaceEnum {
  FRONT, BACK;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

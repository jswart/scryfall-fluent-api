package com.swart.scryfallfluentapi.query.sets.id;

/**
 * @author jake swart
 */
public enum SetsIdFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

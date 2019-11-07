package com.swart.scryfallfluentapi.query.sets;

/**
 * @author jake swart
 */
public enum SetsFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

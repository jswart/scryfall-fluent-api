package com.swart.scryfallfluentapi.query.sets.code;

/**
 * @author jake swart
 */
public enum SetsCodeFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

package io.github.jswart.scryfallfluentapi.query.sets.id;

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

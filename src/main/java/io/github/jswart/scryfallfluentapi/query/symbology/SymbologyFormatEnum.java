package io.github.jswart.scryfallfluentapi.query.symbology;

/**
 * @author jake swart
 */
public enum SymbologyFormatEnum {
  JSON;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}

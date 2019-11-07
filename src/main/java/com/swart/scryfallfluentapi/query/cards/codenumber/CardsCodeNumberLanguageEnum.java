package com.swart.scryfallfluentapi.query.cards.codenumber;

/**
 * @author jake swart
 */
public enum CardsCodeNumberLanguageEnum {
  EN("en"), FR("fr");

  private String langauge;

  private CardsCodeNumberLanguageEnum(final String language) {
    this.langauge = language;
  }

  @Override
  public String toString() {
    return langauge;
  }
}

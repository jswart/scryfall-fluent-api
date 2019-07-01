package com.swart.scryfallapiV2.model;

import java.util.List;
import java.util.Map;

/**
 * Card Face Objects Multiface cards have a�card_faces�property containing at
 * least two Card Face objects.
 *
 * https://scryfall.com/docs/api/cards
 *
 * @author jake swart
 *
 */
public class ScryfallCardFace {

  private String name;
  private String type_line;
  private String oracle_text;
  private String mana_cost;
  private List<String> colors;
  private List<String> color_indicator;
  private String power;
  private String toughness;
  private String loyalty;
  private String flavor_text;
  private String illustration_id;
  private Map<String, String> image_uris;

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getType_line() {
    return type_line;
  }

  public void setType_line(final String type_line) {
    this.type_line = type_line;
  }

  public String getOracle_text() {
    return oracle_text;
  }

  public void setOracle_text(final String oracle_text) {
    this.oracle_text = oracle_text;
  }

  public String getMana_cost() {
    return mana_cost;
  }

  public void setMana_cost(final String mana_cost) {
    this.mana_cost = mana_cost;
  }

  public List<String> getColors() {
    return colors;
  }

  public void setColors(final List<String> colors) {
    this.colors = colors;
  }

  public List<String> getColor_indicator() {
    return color_indicator;
  }

  public void setColor_indicator(final List<String> color_indicator) {
    this.color_indicator = color_indicator;
  }

  public String getPower() {
    return power;
  }

  public void setPower(final String power) {
    this.power = power;
  }

  public String getToughness() {
    return toughness;
  }

  public void setToughness(final String toughness) {
    this.toughness = toughness;
  }

  public String getLoyalty() {
    return loyalty;
  }

  public void setLoyalty(final String loyalty) {
    this.loyalty = loyalty;
  }

  public String getFlavor_text() {
    return flavor_text;
  }

  public void setFlavor_text(final String flavor_text) {
    this.flavor_text = flavor_text;
  }

  public String getIllustration_id() {
    return illustration_id;
  }

  public void setIllustration_id(final String illustration_id) {
    this.illustration_id = illustration_id;
  }

  public Map<String, String> getImage_uris() {
    return image_uris;
  }

  public void setImage_uris(final Map<String, String> image_uris) {
    this.image_uris = image_uris;
  }

}

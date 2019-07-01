package com.swart.scryfallapiV2.model;

import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * Your classic mtg card represented in java.
 *
 * https://scryfall.com/docs/api/cards
 *
 * @author jake swart
 *
 */
public class ScryfallCard {

  /* Core properties */
  private String id;
  private String oracle_id;
  private List<Integer> multiverse_ids;
  private Integer mtgo_id;
  private Integer mtgo_foil_id;
  private URI uri;
  private URI scryfall_uri;
  private URI prints_search_uri;
  private URI rulings_uri;

  /* Gameplay rules */
  private String name;
  private String layout;
  private double cmc;
  private String type_line;
  private String oracle_text;
  private String mana_cost;
  private String power;
  private String toughness;
  private String loyalty;
  private String life_modifier;
  private String hand_modifier;
  private List<String> colors;
  private List<String> color_indicator;
  private List<String> color_identity;
  private List<ScryfallRelatedCard> all_parts; /* closely related cards */

  private List<ScryfallCardFace> card_faces;
  private ScryfallRuling legalities;
  private boolean reserved;
  private boolean foil;
  private boolean nonfoil;
  private boolean oversized;
  private Integer edhrec_rank;

  /* Print Fields - properties unique to their particular re/print */
  private String set;
  private String set_name;
  private String collector_number;
  private URI set_search_uri;
  private URI scryfall_set_uri;
  private Map<String, String> image_uris;
  private boolean highres_image;
  private boolean reprint;
  private boolean digital;
  private String rarity;
  private String flavor_text;
  private String artist;
  private String illustration_id;
  private String frame;
  private boolean full_art;
  private String watermark;
  private String border_color;
  private Integer story_spotlight_number;
  private URI story_spotlight_uri;
  private boolean timeshifted;
  private boolean colorshifted;
  private boolean futureshifted;
  private Map<String, String> related_uris;
  private Map<String, String> purchase_uris;
  private List<ScryfallRelatedCard> related_cards;

  /* Other fields */
  private double usd;
  private double eur;

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getOracle_id() {
    return oracle_id;
  }

  public void setOracle_id(final String oracle_id) {
    this.oracle_id = oracle_id;
  }

  public List<Integer> getMultiverse_ids() {
    return multiverse_ids;
  }

  public void setMultiverse_ids(final List<Integer> multiverse_ids) {
    this.multiverse_ids = multiverse_ids;
  }

  public Integer getMtgo_id() {
    return mtgo_id;
  }

  public void setMtgo_id(final Integer mtgo_id) {
    this.mtgo_id = mtgo_id;
  }

  public Integer getMtgo_foil_id() {
    return mtgo_foil_id;
  }

  public void setMtgo_foil_id(final Integer mtgo_foil_id) {
    this.mtgo_foil_id = mtgo_foil_id;
  }

  public URI getUri() {
    return uri;
  }

  public void setUri(final URI uri) {
    this.uri = uri;
  }

  public URI getScryfall_uri() {
    return scryfall_uri;
  }

  public void setScryfall_uri(final URI scryfall_uri) {
    this.scryfall_uri = scryfall_uri;
  }

  public URI getPrints_search_uri() {
    return prints_search_uri;
  }

  public void setPrints_search_uri(final URI prints_search_uri) {
    this.prints_search_uri = prints_search_uri;
  }

  public URI getRulings_uri() {
    return rulings_uri;
  }

  public void setRulings_uri(final URI rulings_uri) {
    this.rulings_uri = rulings_uri;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getLayout() {
    return layout;
  }

  public void setLayout(final String layout) {
    this.layout = layout;
  }

  public double getCmc() {
    return cmc;
  }

  public void setCmc(final double cmc) {
    this.cmc = cmc;
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

  public String getLife_modifier() {
    return life_modifier;
  }

  public void setLife_modifier(final String life_modifier) {
    this.life_modifier = life_modifier;
  }

  public String getHand_modifier() {
    return hand_modifier;
  }

  public void setHand_modifier(final String hand_modifier) {
    this.hand_modifier = hand_modifier;
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

  public List<String> getColor_identity() {
    return color_identity;
  }

  public void setColor_identity(final List<String> color_identity) {
    this.color_identity = color_identity;
  }

  public List<ScryfallRelatedCard> getAll_parts() {
    return all_parts;
  }

  public void setAll_parts(final List<ScryfallRelatedCard> all_parts) {
    this.all_parts = all_parts;
  }

  public List<ScryfallCardFace> getCard_faces() {
    return card_faces;
  }

  public void setCard_faces(final List<ScryfallCardFace> card_faces) {
    this.card_faces = card_faces;
  }

  public ScryfallRuling getLegalities() {
    return legalities;
  }

  public void setLegalities(final ScryfallRuling legalities) {
    this.legalities = legalities;
  }

  public boolean isReserved() {
    return reserved;
  }

  public void setReserved(final boolean reserved) {
    this.reserved = reserved;
  }

  public boolean isFoil() {
    return foil;
  }

  public void setFoil(final boolean foil) {
    this.foil = foil;
  }

  public boolean isNonfoil() {
    return nonfoil;
  }

  public void setNonfoil(final boolean nonfoil) {
    this.nonfoil = nonfoil;
  }

  public boolean isOversized() {
    return oversized;
  }

  public void setOversized(final boolean oversized) {
    this.oversized = oversized;
  }

  public Integer getEdhrec_rank() {
    return edhrec_rank;
  }

  public void setEdhrec_rank(final Integer edhrec_rank) {
    this.edhrec_rank = edhrec_rank;
  }

  public String getSet() {
    return set;
  }

  public void setSet(final String set) {
    this.set = set;
  }

  public String getSet_name() {
    return set_name;
  }

  public void setSet_name(final String set_name) {
    this.set_name = set_name;
  }

  public String getCollector_number() {
    return collector_number;
  }

  public void setCollector_number(final String collector_number) {
    this.collector_number = collector_number;
  }

  public URI getSet_search_uri() {
    return set_search_uri;
  }

  public void setSet_search_uri(final URI set_search_uri) {
    this.set_search_uri = set_search_uri;
  }

  public URI getScryfall_set_uri() {
    return scryfall_set_uri;
  }

  public void setScryfall_set_uri(final URI scryfall_set_uri) {
    this.scryfall_set_uri = scryfall_set_uri;
  }

  public Map<String, String> getImage_uris() {
    return image_uris;
  }

  public void setImage_uris(final Map<String, String> image_uris) {
    this.image_uris = image_uris;
  }

  public boolean isHighres_image() {
    return highres_image;
  }

  public void setHighres_image(final boolean highres_image) {
    this.highres_image = highres_image;
  }

  public boolean isReprint() {
    return reprint;
  }

  public void setReprint(final boolean reprint) {
    this.reprint = reprint;
  }

  public boolean isDigital() {
    return digital;
  }

  public void setDigital(final boolean digital) {
    this.digital = digital;
  }

  public String getRarity() {
    return rarity;
  }

  public void setRarity(final String rarity) {
    this.rarity = rarity;
  }

  public String getFlavor_text() {
    return flavor_text;
  }

  public void setFlavor_text(final String flavor_text) {
    this.flavor_text = flavor_text;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(final String artist) {
    this.artist = artist;
  }

  public String getIllustration_id() {
    return illustration_id;
  }

  public void setIllustration_id(final String illustration_id) {
    this.illustration_id = illustration_id;
  }

  public String getFrame() {
    return frame;
  }

  public void setFrame(final String frame) {
    this.frame = frame;
  }

  public boolean isFull_art() {
    return full_art;
  }

  public void setFull_art(final boolean full_art) {
    this.full_art = full_art;
  }

  public String getWatermark() {
    return watermark;
  }

  public void setWatermark(final String watermark) {
    this.watermark = watermark;
  }

  public String getBorder_color() {
    return border_color;
  }

  public void setBorder_color(final String border_color) {
    this.border_color = border_color;
  }

  public Integer getStory_spotlight_number() {
    return story_spotlight_number;
  }

  public void setStory_spotlight_number(final Integer story_spotlight_number) {
    this.story_spotlight_number = story_spotlight_number;
  }

  public URI getStory_spotlight_uri() {
    return story_spotlight_uri;
  }

  public void setStory_spotlight_uri(final URI story_spotlight_uri) {
    this.story_spotlight_uri = story_spotlight_uri;
  }

  public boolean isTimeshifted() {
    return timeshifted;
  }

  public void setTimeshifted(final boolean timeshifted) {
    this.timeshifted = timeshifted;
  }

  public boolean isColorshifted() {
    return colorshifted;
  }

  public void setColorshifted(final boolean colorshifted) {
    this.colorshifted = colorshifted;
  }

  public boolean isFutureshifted() {
    return futureshifted;
  }

  public void setFutureshifted(final boolean futureshifted) {
    this.futureshifted = futureshifted;
  }

  public Map<String, String> getRelated_uris() {
    return related_uris;
  }

  public void setRelated_uris(final Map<String, String> related_uris) {
    this.related_uris = related_uris;
  }

  public Map<String, String> getPurchase_uris() {
    return purchase_uris;
  }

  public void setPurchase_uris(final Map<String, String> purchase_uris) {
    this.purchase_uris = purchase_uris;
  }

  public List<ScryfallRelatedCard> getRelated_cards() {
    return related_cards;
  }

  public void setRelated_cards(final List<ScryfallRelatedCard> related_cards) {
    this.related_cards = related_cards;
  }

  public double getUsd() {
    return usd;
  }

  public void setUsd(final double usd) {
    this.usd = usd;
  }

  public double getEur() {
    return eur;
  }

  public void setEur(final double eur) {
    this.eur = eur;
  }

}

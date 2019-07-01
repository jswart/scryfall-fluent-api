package com.swart.scryfallapiV2.model;

import java.net.URI;
import java.util.Date;

/**
 *
 * @author jake swart
 *
 */
public class ScryfallSet {
  private String code;
  private String mtgo_code;
  private String name;
  private String set_type;
  private Date released_at;
  private String block_code;
  private String block;
  private String parent_set_code;
  private Integer card_count;
  private Boolean digital;
  private Boolean foil_only;
  private URI icon_svg_uri;
  private URI search_uri;

  public String getCode() {
    return code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public String getMtgo_code() {
    return mtgo_code;
  }

  public void setMtgo_code(final String mtgo_code) {
    this.mtgo_code = mtgo_code;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getSet_type() {
    return set_type;
  }

  public void setSet_type(final String set_type) {
    this.set_type = set_type;
  }

  public Date getReleased_at() {
    return released_at;
  }

  public void setReleased_at(final Date released_at) {
    this.released_at = released_at;
  }

  public String getBlock_code() {
    return block_code;
  }

  public void setBlock_code(final String block_code) {
    this.block_code = block_code;
  }

  public String getBlock() {
    return block;
  }

  public void setBlock(final String block) {
    this.block = block;
  }

  public String getParent_set_code() {
    return parent_set_code;
  }

  public void setParent_set_code(final String parent_set_code) {
    this.parent_set_code = parent_set_code;
  }

  public Integer getCard_count() {
    return card_count;
  }

  public void setCard_count(final Integer card_count) {
    this.card_count = card_count;
  }

  public Boolean getDigital() {
    return digital;
  }

  public void setDigital(final Boolean digital) {
    this.digital = digital;
  }

  public Boolean getFoil_only() {
    return foil_only;
  }

  public void setFoil_only(final Boolean foil_only) {
    this.foil_only = foil_only;
  }

  public URI getIcon_svg_uri() {
    return icon_svg_uri;
  }

  public void setIcon_svg_uri(final URI icon_svg_uri) {
    this.icon_svg_uri = icon_svg_uri;
  }

  public URI getSearch_uri() {
    return search_uri;
  }

  public void setSearch_uri(final URI search_uri) {
    this.search_uri = search_uri;
  }

}

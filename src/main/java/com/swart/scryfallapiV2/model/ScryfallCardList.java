package com.swart.scryfallapiV2.model;

import java.net.URL;
import java.util.List;

/**
 *
 * @author jake swart
 *
 */
public class ScryfallCardList {

  List<ScryfallCard> data;
  boolean has_more;
  URL next_page;
  Integer total_cards;
  List<String> warnings;

  public List<ScryfallCard> getData() {
    return data;
  }

  public void setData(final List<ScryfallCard> data) {
    this.data = data;
  }

  public boolean isHas_more() {
    return has_more;
  }

  public void setHas_more(final boolean has_more) {
    this.has_more = has_more;
  }

  public URL getNext_page() {
    return next_page;
  }

  public void setNext_page(final URL next_page) {
    this.next_page = next_page;
  }

  public Integer getTotal_cards() {
    return total_cards;
  }

  public void setTotal_cards(final Integer total_cards) {
    this.total_cards = total_cards;
  }

  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(final List<String> warnings) {
    this.warnings = warnings;
  }

}

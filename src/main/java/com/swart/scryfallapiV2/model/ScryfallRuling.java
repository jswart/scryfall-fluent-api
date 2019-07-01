package com.swart.scryfallapiV2.model;

import java.util.Date;

/**
 * Oracle rulings, Wizards of the Coast set release notes, or Scryfall notes for
 * a particular card.
 *
 * https://scryfall.com/docs/api/rulings
 *
 * @author jake swart
 *
 */
public class ScryfallRuling {

  private String source;
  private Date published_at;
  private String comment;

  public String getSource() {
    return source;
  }

  public void setSource(final String source) {
    this.source = source;
  }

  public Date getPublished_at() {
    return published_at;
  }

  public void setPublished_at(final Date published_at) {
    this.published_at = published_at;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(final String comment) {
    this.comment = comment;
  }

}

package com.swart.scryfallapiV2.query.sets.id;

/**
 * @author jake swart
 */
public class SetsIdFormatImpl implements SetsIdFormatInf {

  SetsIdImpl cardNamed = null;

  protected SetsIdFormatImpl(final SetsIdImpl cardNamed) {
    this.cardNamed = cardNamed;
  }

  public SetsIdInf json() {
    cardNamed.setFormat(SetsIdFormatEnum.JSON);
    return cardNamed;
  }

}

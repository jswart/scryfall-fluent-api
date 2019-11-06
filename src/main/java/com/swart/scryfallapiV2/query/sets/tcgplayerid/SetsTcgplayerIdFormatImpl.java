package com.swart.scryfallapiV2.query.sets.tcgplayerid;

/**
 * @author jake swart
 */
public class SetsTcgplayerIdFormatImpl implements SetsTcgplayerIdFormatInf {

  SetsTcgplayerIdImpl setsImpl = null;

  protected SetsTcgplayerIdFormatImpl(final SetsTcgplayerIdImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public SetsTcgplayerIdInf json() {
    setsImpl.setFormat(SetsTcgplayerIdFormatEnum.JSON);
    return setsImpl;
  }

}

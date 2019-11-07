package com.swart.scryfallfluentapi.query.sets.code;

/**
 * @author jake swart
 */
public class SetsCodeFormatImpl implements SetsCodeFormatInf {

  SetsCodeImpl setsImpl = null;

  protected SetsCodeFormatImpl(final SetsCodeImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public SetsCodeInf json() {
    setsImpl.setFormat(SetsCodeFormatEnum.JSON);
    return setsImpl;
  }

}

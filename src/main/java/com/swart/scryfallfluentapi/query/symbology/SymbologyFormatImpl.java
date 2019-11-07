package com.swart.scryfallfluentapi.query.symbology;

/**
 * @author jake swart
 */
public class SymbologyFormatImpl implements SymbologyFormatInf {

  SymbologyImpl setsImpl = null;

  protected SymbologyFormatImpl(final SymbologyImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public SymbologyInf json() {
    setsImpl.setFormat(SymbologyFormatEnum.JSON);
    return setsImpl;
  }

}

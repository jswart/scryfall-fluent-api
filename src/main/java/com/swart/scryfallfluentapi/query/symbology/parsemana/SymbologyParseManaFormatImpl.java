package com.swart.scryfallfluentapi.query.symbology.parsemana;

/**
 * @author jake swart
 */
public class SymbologyParseManaFormatImpl implements SymbologyParseManaFormatInf {

  SymbologyParseManaImpl symbologyImpl = null;

  protected SymbologyParseManaFormatImpl(final SymbologyParseManaImpl symbologyImpl) {
    this.symbologyImpl = symbologyImpl;
  }

  public SymbologyParseManaInf json() {
    symbologyImpl.setFormat(SymbologyParseManaFormatEnum.JSON);
    return symbologyImpl;
  }

}

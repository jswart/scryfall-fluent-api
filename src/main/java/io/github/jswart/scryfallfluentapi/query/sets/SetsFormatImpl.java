package io.github.jswart.scryfallfluentapi.query.sets;

/**
 * @author jake swart
 */
public class SetsFormatImpl implements SetsFormatInf {

  SetsImpl setsImpl = null;

  protected SetsFormatImpl(final SetsImpl setsImpl) {
    this.setsImpl = setsImpl;
  }

  public SetsInf json() {
    setsImpl.setFormat(SetsFormatEnum.JSON);
    return setsImpl;
  }

}

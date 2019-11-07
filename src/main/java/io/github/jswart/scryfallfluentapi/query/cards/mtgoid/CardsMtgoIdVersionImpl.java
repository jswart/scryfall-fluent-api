package io.github.jswart.scryfallfluentapi.query.cards.mtgoid;

/**
 * @author jake swart
 */
public class CardsMtgoIdVersionImpl implements CardsMtgoIdVersionInf {

  CardsMtgoIdImpl mtgoId = null;

  protected CardsMtgoIdVersionImpl(final CardsMtgoIdImpl cardNamed) {
    this.mtgoId = cardNamed;
  }

  public CardsMtgoIdInf small() {
    mtgoId.setVersion(CardsMtgoIdVersionEnum.SMALL);
    return mtgoId;
  }

  public CardsMtgoIdInf normal() {
    mtgoId.setVersion(CardsMtgoIdVersionEnum.NORMAL);
    return mtgoId;
  }

  public CardsMtgoIdInf large() {
    mtgoId.setVersion(CardsMtgoIdVersionEnum.LARGE);
    return mtgoId;
  }

  public CardsMtgoIdInf png() {
    mtgoId.setVersion(CardsMtgoIdVersionEnum.PNG);
    return mtgoId;
  }

  public CardsMtgoIdInf artCrop() {
    mtgoId.setVersion(CardsMtgoIdVersionEnum.ART_CROP);
    return mtgoId;
  }

  public CardsMtgoIdInf borderCrop() {
    mtgoId.setVersion(CardsMtgoIdVersionEnum.BORDER_CROP);
    return mtgoId;
  }

}

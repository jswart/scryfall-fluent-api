package com.swart.scryfallfluentapi.query.cards;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.swart.scryfallfluentapi.query.ScryFallApiConstants;
import com.swart.scryfallfluentapi.query.cards.arenaid.CardsArenaIdImpl;
import com.swart.scryfallfluentapi.query.cards.arenaid.CardsArenaIdInf;
import com.swart.scryfallfluentapi.query.cards.autocomplete.CardsAutoCompleteImpl;
import com.swart.scryfallfluentapi.query.cards.autocomplete.CardsAutoCompleteInf;
import com.swart.scryfallfluentapi.query.cards.codenumber.CardsCodeNumberImpl;
import com.swart.scryfallfluentapi.query.cards.codenumber.CardsCodeNumberInf;
import com.swart.scryfallfluentapi.query.cards.collection.CardsCollectionImpl;
import com.swart.scryfallfluentapi.query.cards.collection.CardsCollectionInf;
import com.swart.scryfallfluentapi.query.cards.id.CardsIdImpl;
import com.swart.scryfallfluentapi.query.cards.id.CardsIdInf;
import com.swart.scryfallfluentapi.query.cards.mtgoid.CardsMtgoIdImpl;
import com.swart.scryfallfluentapi.query.cards.mtgoid.CardsMtgoIdInf;
import com.swart.scryfallfluentapi.query.cards.multiverseid.CardsMultiverseIdImpl;
import com.swart.scryfallfluentapi.query.cards.multiverseid.CardsMultiverseIdInf;
import com.swart.scryfallfluentapi.query.cards.named.CardsNamedImpl;
import com.swart.scryfallfluentapi.query.cards.named.CardsNamedInf;
import com.swart.scryfallfluentapi.query.cards.random.CardsRandomImpl;
import com.swart.scryfallfluentapi.query.cards.random.CardsRandomInf;
import com.swart.scryfallfluentapi.query.cards.search.CardsSearchImpl;
import com.swart.scryfallfluentapi.query.cards.search.CardsSearchInf;
import com.swart.scryfallfluentapi.query.cards.tcgplayerid.CardsTcgplayerIdImpl;
import com.swart.scryfallfluentapi.query.cards.tcgplayerid.CardsTcgplayerIdInf;
import com.swart.scryfallfluentapi.util.UrlUtil;

/**
 * @author jake swart
 */
public class CardsImpl implements CardsInf {

  public CardsSearchInf search() {
    return new CardsSearchImpl();
  }

  public CardsNamedInf named() {
    return new CardsNamedImpl();
  }

  public CardsAutoCompleteInf autocomplete() {
    return new CardsAutoCompleteImpl();
  }

  public CardsRandomInf random() {
    return new CardsRandomImpl();
  }

  public CardsCollectionInf collection() {
    return new CardsCollectionImpl();
  }

  public CardsCodeNumberInf codeNumberLang() {
    return new CardsCodeNumberImpl();
  }

  public CardsMultiverseIdInf multiverseId() {
    return new CardsMultiverseIdImpl();
  }

  public CardsMtgoIdInf mtgoId() {
    return new CardsMtgoIdImpl();
  }

  public CardsArenaIdInf arenaId() {
    return new CardsArenaIdImpl();
  }

  public CardsTcgplayerIdInf tcgplayerId() {
    return new CardsTcgplayerIdImpl();
  }

  public CardsIdInf id() {
    return new CardsIdImpl();
  }

  private final CardsFormatInf formatInst;

  private Integer page = 1;
  private CardsFormatEnum format = CardsFormatEnum.JSON;
  private Boolean pretty = Boolean.FALSE;

  public CardsImpl() {
    formatInst = new CardsFormatImpl(this);
  }

  public URL buildUrl() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public URL buildVerboseUrl() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    final URL url = UrlUtil.createUrl(urlStr);
    return url;
  }

  public String build() {
    final List<String> urlOptions = from();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    return urlStr;
  }

  public String buildVerbose() {
    final List<String> urlOptions = fromVerbose();
    final String options = UrlUtil.paramJoiner(urlOptions, "&");
    final String question = (options.isEmpty()) ? "" : "?";
    final String urlStr = String.format("%s/cards%s%s", ScryFallApiConstants.BASE_API_URL, question, options);
    return urlStr;
  }

  /* Client options */
  public CardsInf withPage(final int pageNumber) {
    this.page = pageNumber;
    return this;
  }

  public CardsInf withPretty() {
    this.pretty = Boolean.TRUE;
    return this;
  }

  /* Option implementation accessors into this class */
  public void setFormat(final CardsFormatEnum format) {
    this.format = format;
  }

  public CardsFormatInf withFormat() {
    return formatInst;
  }

  private List<String> fromVerbose() {

    final List<String> params = new ArrayList<String>();
    params.add(String.format("page=%s", this.page));
    params.add(String.format("format=%s", this.format.toString()));
    params.add(String.format("pretty=%s", this.pretty.toString()));
    return params;
  }

  private List<String> from() {

    final List<String> params = new ArrayList<String>();
    if (page != 1) {
      params.add(String.format("page=%s", this.page));
    }
    if (format != CardsFormatEnum.JSON) {
      params.add(String.format("format=%s", this.format.toString()));
    }
    if (pretty) {
      params.add(String.format("pretty=%s", this.pretty.toString()));
    }

    return params;
  }

}

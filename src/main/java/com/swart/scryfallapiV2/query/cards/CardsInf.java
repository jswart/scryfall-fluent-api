package com.swart.scryfallapiV2.query.cards;

import com.swart.scryfallapiV2.query.BuildEndInf;
import com.swart.scryfallapiV2.query.cards.arenaid.CardsArenaIdInf;
import com.swart.scryfallapiV2.query.cards.autocomplete.CardsAutoCompleteInf;
import com.swart.scryfallapiV2.query.cards.codenumber.CardsCodeNumberInf;
import com.swart.scryfallapiV2.query.cards.collection.CardsCollectionInf;
import com.swart.scryfallapiV2.query.cards.id.CardsIdInf;
import com.swart.scryfallapiV2.query.cards.mtgoid.CardsMtgoIdInf;
import com.swart.scryfallapiV2.query.cards.multiverseid.CardsMultiverseIdInf;
import com.swart.scryfallapiV2.query.cards.named.CardsNamedInf;
import com.swart.scryfallapiV2.query.cards.random.CardsRandomInf;
import com.swart.scryfallapiV2.query.cards.search.CardsSearchInf;
import com.swart.scryfallapiV2.query.cards.tcgplayerid.CardsTcgplayerIdInf;

/**
 * @author jake swart
 */
public interface CardsInf extends BuildEndInf {

  // /cards
  CardsInf withPage(int pageNumber);

  CardsFormatInf withFormat();

  CardsInf withPretty();

  // /cards/search
  CardsSearchInf search();

  // /cards/named
  CardsNamedInf named();

  // /cards/autocomplete
  CardsAutoCompleteInf autocomplete();

  // /cards/random
  CardsRandomInf random();

  // /cards/collection
  CardsCollectionInf collection();

  // /cards/:code/:number(/:lang)
  CardsCodeNumberInf codeNumberLang();

  // /cards/multiverse/:id
  CardsMultiverseIdInf multiverseId();

  // /cards/mtgo/:id
  CardsMtgoIdInf mtgoId();

  // /cards/arena/:id
  CardsArenaIdInf arenaId();

  // /cards/tcgplayer/:id
  CardsTcgplayerIdInf tcgplayerId();

  // /cards/:id
  CardsIdInf id();

}

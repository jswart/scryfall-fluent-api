package io.github.jswart.scryfallfluentapi.query.cards;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;
import io.github.jswart.scryfallfluentapi.query.cards.arenaid.CardsArenaIdInf;
import io.github.jswart.scryfallfluentapi.query.cards.autocomplete.CardsAutoCompleteInf;
import io.github.jswart.scryfallfluentapi.query.cards.codenumber.CardsCodeNumberInf;
import io.github.jswart.scryfallfluentapi.query.cards.collection.CardsCollectionInf;
import io.github.jswart.scryfallfluentapi.query.cards.id.CardsIdInf;
import io.github.jswart.scryfallfluentapi.query.cards.mtgoid.CardsMtgoIdInf;
import io.github.jswart.scryfallfluentapi.query.cards.multiverseid.CardsMultiverseIdInf;
import io.github.jswart.scryfallfluentapi.query.cards.named.CardsNamedInf;
import io.github.jswart.scryfallfluentapi.query.cards.random.CardsRandomInf;
import io.github.jswart.scryfallfluentapi.query.cards.search.CardsSearchInf;
import io.github.jswart.scryfallfluentapi.query.cards.tcgplayerid.CardsTcgplayerIdInf;

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

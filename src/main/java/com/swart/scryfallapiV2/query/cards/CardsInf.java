package com.swart.scryfallapiV2.query.cards;

import com.swart.scryfallapiV2.query.BuildEndInf;
import com.swart.scryfallapiV2.query.cards.autocomplete.CardsAutoCompleteInf;
import com.swart.scryfallapiV2.query.cards.named.CardsNamedInf;
import com.swart.scryfallapiV2.query.cards.random.CardsRandomInf;
import com.swart.scryfallapiV2.query.cards.search.CardsSearchInf;

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

//  // /cards/collection
//  QueryCardsInf collection();
//
//  // /cards/:code/:number(/:lang)
//  QueryCardsInf code();
//
//  // /cards/multiverse/:id
//  QueryCardsInf multiverse();
//
//  // /cards/mtgo/:id
//  QueryCardsInf mtgo();
//
//  // /cards/arena/:id
//  QueryCardsInf arena();
//
//  // /cards/tcgplayer/:id
//  QueryCardsInf tcgplayer();
//
//  // /cards/:id
//  QueryCardsInf id();

}

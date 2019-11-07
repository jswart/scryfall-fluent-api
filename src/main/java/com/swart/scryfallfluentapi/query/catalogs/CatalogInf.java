package com.swart.scryfallfluentapi.query.catalogs;

import com.swart.scryfallfluentapi.query.catalogs.artifacttypes.CatalogArtifactTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.artistnames.CatalogArtistNamesInf;
import com.swart.scryfallfluentapi.query.catalogs.cardnames.CatalogCardNamesInf;
import com.swart.scryfallfluentapi.query.catalogs.creaturetypes.CatalogCreatureTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.enchantmenttypes.CatalogEnchantmentTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.landtypes.CatalogLandTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.loyalties.CatalogLoyaltiesInf;
import com.swart.scryfallfluentapi.query.catalogs.planeswalkertypes.CatalogPlaneswalkerTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.powers.CatalogPowersInf;
import com.swart.scryfallfluentapi.query.catalogs.spelltypes.CatalogSpellTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.toughness.CatalogToughnessInf;
import com.swart.scryfallfluentapi.query.catalogs.watermarks.CatalogWatermarksInf;
import com.swart.scryfallfluentapi.query.catalogs.wordbank.CatalogWordBankInf;

/**
 * @author jake swart
 */
public interface CatalogInf {

  // /catalog/card-names
  CatalogCardNamesInf cardnames();

  // /catalog/artist-names
  CatalogArtistNamesInf artistnames();

  // /catalog/word-bank
  CatalogWordBankInf wordbank();

  // /catalog/creature-types
  CatalogCreatureTypesInf creaturetypes();

  // /catalog/planeswalker-types
  CatalogPlaneswalkerTypesInf planeswalkertypes();

  // /catalog/land-types
  CatalogLandTypesInf landtypes();

  // /catalog/artifact-types
  CatalogArtifactTypesInf artifacttypes();

  // /catalog/enchantment-types
  CatalogEnchantmentTypesInf enchantmenttypes();

  // /catalog/spell-types
  CatalogSpellTypesInf spelltypes();

  // /catalog/powers
  CatalogPowersInf powers();

  // /catalog/toughness
  CatalogToughnessInf toughness();

  // /catalog/loyalties
  CatalogLoyaltiesInf loyalties();

  // /catalog/watermarks
  CatalogWatermarksInf watermarks();

}

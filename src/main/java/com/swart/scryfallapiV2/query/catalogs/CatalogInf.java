package com.swart.scryfallapiV2.query.catalogs;

import com.swart.scryfallapiV2.query.catalogs.artifacttypes.CatalogArtifactTypesInf;
import com.swart.scryfallapiV2.query.catalogs.artistnames.CatalogArtistNamesInf;
import com.swart.scryfallapiV2.query.catalogs.cardnames.CatalogCardNamesInf;
import com.swart.scryfallapiV2.query.catalogs.creaturetypes.CatalogCreatureTypesInf;
import com.swart.scryfallapiV2.query.catalogs.enchantmenttypes.CatalogEnchantmentTypesInf;
import com.swart.scryfallapiV2.query.catalogs.landtypes.CatalogLandTypesInf;
import com.swart.scryfallapiV2.query.catalogs.loyalties.CatalogLoyaltiesInf;
import com.swart.scryfallapiV2.query.catalogs.planeswalkertypes.CatalogPlaneswalkerTypesInf;
import com.swart.scryfallapiV2.query.catalogs.powers.CatalogPowersInf;
import com.swart.scryfallapiV2.query.catalogs.spelltypes.CatalogSpellTypesInf;
import com.swart.scryfallapiV2.query.catalogs.toughness.CatalogToughnessInf;
import com.swart.scryfallapiV2.query.catalogs.watermarks.CatalogWatermarksInf;
import com.swart.scryfallapiV2.query.catalogs.wordbank.CatalogWordBankInf;

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

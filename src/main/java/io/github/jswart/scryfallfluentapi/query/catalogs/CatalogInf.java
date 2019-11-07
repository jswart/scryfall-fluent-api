package io.github.jswart.scryfallfluentapi.query.catalogs;

import io.github.jswart.scryfallfluentapi.query.catalogs.artifacttypes.CatalogArtifactTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.artistnames.CatalogArtistNamesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.cardnames.CatalogCardNamesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.creaturetypes.CatalogCreatureTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.enchantmenttypes.CatalogEnchantmentTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.landtypes.CatalogLandTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.loyalties.CatalogLoyaltiesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.planeswalkertypes.CatalogPlaneswalkerTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.powers.CatalogPowersInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.spelltypes.CatalogSpellTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.toughness.CatalogToughnessInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.watermarks.CatalogWatermarksInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.wordbank.CatalogWordBankInf;

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

package io.github.jswart.scryfallfluentapi.query.catalogs;

import io.github.jswart.scryfallfluentapi.query.catalogs.artifacttypes.CatalogArtifactTypesImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.artifacttypes.CatalogArtifactTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.artistnames.CatalogArtistNamesImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.artistnames.CatalogArtistNamesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.cardnames.CatalogCardNamesImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.cardnames.CatalogCardNamesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.creaturetypes.CatalogCreatureTypesImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.creaturetypes.CatalogCreatureTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.enchantmenttypes.CatalogEnchantmentTypesImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.enchantmenttypes.CatalogEnchantmentTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.landtypes.CatalogLandTypesImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.landtypes.CatalogLandTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.loyalties.CatalogLoyaltiesImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.loyalties.CatalogLoyaltiesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.planeswalkertypes.CatalogPlaneswalkerTypesImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.planeswalkertypes.CatalogPlaneswalkerTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.powers.CatalogPowersImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.powers.CatalogPowersInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.spelltypes.CatalogSpellTypesImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.spelltypes.CatalogSpellTypesInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.toughness.CatalogToughnessImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.toughness.CatalogToughnessInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.watermarks.CatalogWatermarksImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.watermarks.CatalogWatermarksInf;
import io.github.jswart.scryfallfluentapi.query.catalogs.wordbank.CatalogWordBankImpl;
import io.github.jswart.scryfallfluentapi.query.catalogs.wordbank.CatalogWordBankInf;

/**
 * @author jake swart
 */
public class CatalogImpl implements CatalogInf {

  public CatalogCardNamesInf cardnames() {
    return new CatalogCardNamesImpl();
  }

  public CatalogArtistNamesInf artistnames() {
    return new CatalogArtistNamesImpl();
  }

  public CatalogWordBankInf wordbank() {
    return new CatalogWordBankImpl();
  }

  public CatalogCreatureTypesInf creaturetypes() {
    return new CatalogCreatureTypesImpl();
  }

  public CatalogPlaneswalkerTypesInf planeswalkertypes() {
    return new CatalogPlaneswalkerTypesImpl();
  }

  public CatalogLandTypesInf landtypes() {
    return new CatalogLandTypesImpl();
  }

  public CatalogArtifactTypesInf artifacttypes() {
    return new CatalogArtifactTypesImpl();
  }

  public CatalogEnchantmentTypesInf enchantmenttypes() {
    return new CatalogEnchantmentTypesImpl();
  }

  public CatalogSpellTypesInf spelltypes() {
    return new CatalogSpellTypesImpl();
  }

  public CatalogPowersInf powers() {
    return new CatalogPowersImpl();
  }

  public CatalogToughnessInf toughness() {
    return new CatalogToughnessImpl();
  }

  public CatalogLoyaltiesInf loyalties() {
    return new CatalogLoyaltiesImpl();
  }

  public CatalogWatermarksInf watermarks() {
    return new CatalogWatermarksImpl();
  }

  public CatalogImpl() {
  }

}

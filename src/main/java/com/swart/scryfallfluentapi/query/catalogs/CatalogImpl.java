package com.swart.scryfallfluentapi.query.catalogs;

import com.swart.scryfallfluentapi.query.catalogs.artifacttypes.CatalogArtifactTypesImpl;
import com.swart.scryfallfluentapi.query.catalogs.artifacttypes.CatalogArtifactTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.artistnames.CatalogArtistNamesImpl;
import com.swart.scryfallfluentapi.query.catalogs.artistnames.CatalogArtistNamesInf;
import com.swart.scryfallfluentapi.query.catalogs.cardnames.CatalogCardNamesImpl;
import com.swart.scryfallfluentapi.query.catalogs.cardnames.CatalogCardNamesInf;
import com.swart.scryfallfluentapi.query.catalogs.creaturetypes.CatalogCreatureTypesImpl;
import com.swart.scryfallfluentapi.query.catalogs.creaturetypes.CatalogCreatureTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.enchantmenttypes.CatalogEnchantmentTypesImpl;
import com.swart.scryfallfluentapi.query.catalogs.enchantmenttypes.CatalogEnchantmentTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.landtypes.CatalogLandTypesImpl;
import com.swart.scryfallfluentapi.query.catalogs.landtypes.CatalogLandTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.loyalties.CatalogLoyaltiesImpl;
import com.swart.scryfallfluentapi.query.catalogs.loyalties.CatalogLoyaltiesInf;
import com.swart.scryfallfluentapi.query.catalogs.planeswalkertypes.CatalogPlaneswalkerTypesImpl;
import com.swart.scryfallfluentapi.query.catalogs.planeswalkertypes.CatalogPlaneswalkerTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.powers.CatalogPowersImpl;
import com.swart.scryfallfluentapi.query.catalogs.powers.CatalogPowersInf;
import com.swart.scryfallfluentapi.query.catalogs.spelltypes.CatalogSpellTypesImpl;
import com.swart.scryfallfluentapi.query.catalogs.spelltypes.CatalogSpellTypesInf;
import com.swart.scryfallfluentapi.query.catalogs.toughness.CatalogToughnessImpl;
import com.swart.scryfallfluentapi.query.catalogs.toughness.CatalogToughnessInf;
import com.swart.scryfallfluentapi.query.catalogs.watermarks.CatalogWatermarksImpl;
import com.swart.scryfallfluentapi.query.catalogs.watermarks.CatalogWatermarksInf;
import com.swart.scryfallfluentapi.query.catalogs.wordbank.CatalogWordBankImpl;
import com.swart.scryfallfluentapi.query.catalogs.wordbank.CatalogWordBankInf;

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

package com.swart.scryfallapiV2.query.catalogs;

import com.swart.scryfallapiV2.query.catalogs.artifacttypes.CatalogArtifactTypesImpl;
import com.swart.scryfallapiV2.query.catalogs.artifacttypes.CatalogArtifactTypesInf;
import com.swart.scryfallapiV2.query.catalogs.artistnames.CatalogArtistNamesImpl;
import com.swart.scryfallapiV2.query.catalogs.artistnames.CatalogArtistNamesInf;
import com.swart.scryfallapiV2.query.catalogs.cardnames.CatalogCardNamesImpl;
import com.swart.scryfallapiV2.query.catalogs.cardnames.CatalogCardNamesInf;
import com.swart.scryfallapiV2.query.catalogs.creaturetypes.CatalogCreatureTypesImpl;
import com.swart.scryfallapiV2.query.catalogs.creaturetypes.CatalogCreatureTypesInf;
import com.swart.scryfallapiV2.query.catalogs.enchantmenttypes.CatalogEnchantmentTypesImpl;
import com.swart.scryfallapiV2.query.catalogs.enchantmenttypes.CatalogEnchantmentTypesInf;
import com.swart.scryfallapiV2.query.catalogs.landtypes.CatalogLandTypesImpl;
import com.swart.scryfallapiV2.query.catalogs.landtypes.CatalogLandTypesInf;
import com.swart.scryfallapiV2.query.catalogs.loyalties.CatalogLoyaltiesImpl;
import com.swart.scryfallapiV2.query.catalogs.loyalties.CatalogLoyaltiesInf;
import com.swart.scryfallapiV2.query.catalogs.planeswalkertypes.CatalogPlaneswalkerTypesImpl;
import com.swart.scryfallapiV2.query.catalogs.planeswalkertypes.CatalogPlaneswalkerTypesInf;
import com.swart.scryfallapiV2.query.catalogs.powers.CatalogPowersImpl;
import com.swart.scryfallapiV2.query.catalogs.powers.CatalogPowersInf;
import com.swart.scryfallapiV2.query.catalogs.spelltypes.CatalogSpellTypesImpl;
import com.swart.scryfallapiV2.query.catalogs.spelltypes.CatalogSpellTypesInf;
import com.swart.scryfallapiV2.query.catalogs.toughness.CatalogToughnessImpl;
import com.swart.scryfallapiV2.query.catalogs.toughness.CatalogToughnessInf;
import com.swart.scryfallapiV2.query.catalogs.watermarks.CatalogWatermarksImpl;
import com.swart.scryfallapiV2.query.catalogs.watermarks.CatalogWatermarksInf;
import com.swart.scryfallapiV2.query.catalogs.wordbank.CatalogWordBankImpl;
import com.swart.scryfallapiV2.query.catalogs.wordbank.CatalogWordBankInf;

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

package com.swart.scryfallapiV2.query.sets.id;

import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SetsIdInf extends BuildEndInf {

  SetsIdInf withId(String uuid);

  SetsIdFormatInf withFormat();

  SetsIdInf withPretty();

}

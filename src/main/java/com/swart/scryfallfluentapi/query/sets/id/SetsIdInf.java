package com.swart.scryfallfluentapi.query.sets.id;

import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SetsIdInf extends BuildEndInf {

  SetsIdInf withId(String uuid);

  SetsIdFormatInf withFormat();

  SetsIdInf withPretty();

}

package io.github.jswart.scryfallfluentapi.query.sets.id;

import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SetsIdInf extends BuildEndInf {

  SetsIdInf withId(String uuid);

  SetsIdFormatInf withFormat();

  SetsIdInf withPretty();

}

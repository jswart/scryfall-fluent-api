package io.github.jswart.scryfallfluentapi.query.sets.code;

import io.github.jswart.scryfallfluentapi.model.SetDBEnum;
import io.github.jswart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SetsCodeInf extends BuildEndInf {

  SetsCodeInf withSet(SetDBEnum set);

  SetsCodeFormatInf withFormat();

  SetsCodeInf withPretty();

}

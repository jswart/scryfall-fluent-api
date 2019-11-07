package com.swart.scryfallfluentapi.query.sets.code;

import com.swart.scryfallfluentapi.model.SetDBEnum;
import com.swart.scryfallfluentapi.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SetsCodeInf extends BuildEndInf {

  SetsCodeInf withSet(SetDBEnum set);

  SetsCodeFormatInf withFormat();

  SetsCodeInf withPretty();

}

package com.swart.scryfallapiV2.query.sets.code;

import com.swart.scryfallapiV2.model.SetDBEnum;
import com.swart.scryfallapiV2.query.BuildEndInf;

/**
 * @author jake swart
 */
public interface SetsCodeInf extends BuildEndInf {

  SetsCodeInf withSet(SetDBEnum set);

  SetsCodeFormatInf withFormat();

  SetsCodeInf withPretty();

}

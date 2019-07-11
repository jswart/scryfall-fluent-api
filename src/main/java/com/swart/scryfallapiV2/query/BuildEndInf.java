package com.swart.scryfallapiV2.query;

import java.net.URL;

public interface BuildEndInf {

  String build();

  String buildVerbose();

  URL buildUrl();

  /* Explicitly define each endPoint option (all defaults in URL) */
  URL buildVerboseUrl();

}

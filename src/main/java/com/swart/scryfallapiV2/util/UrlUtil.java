package com.swart.scryfallapiV2.util;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class UrlUtil {

  public static URL createUrl(final String urlStr) {
    try {
      return new URL(urlStr);
    } catch (final MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  public static String urlEncodeString(final String query) {
    try {
      return URLEncoder.encode(query, StandardCharsets.UTF_8.name());
    } catch (final UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
  }

  public static String paramJoiner(final List<String> params, final String on) {

    if (params.isEmpty()) {
      return "";
    }

    if (params.size() == 1) {
      return params.remove(0);
    }

    return params.remove(0) + on + paramJoiner(params, on);
  }

}

package com.swart.scryfallapiV2;

import java.net.URL;

import org.junit.Test;

import com.swart.scryfallapiV2.query.Query;

public class AppTest {

  @Test
  public void test() {
    final URL url = Query.cards().search().withUnique().art().buildVerboseUrl();
    System.out.println(url.toString());
  }

}

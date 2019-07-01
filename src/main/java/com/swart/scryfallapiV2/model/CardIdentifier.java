package com.swart.scryfallapiV2.model;

public class CardIdentifier {

  private String id;
  private Integer mtgo_id;
  private Integer multiverse_id;
  private String name;
  private String set;
  private String collector_number;

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public Integer getMtgo_id() {
    return mtgo_id;
  }

  public void setMtgo_id(final Integer mtgo_id) {
    this.mtgo_id = mtgo_id;
  }

  public Integer getMultiverse_id() {
    return multiverse_id;
  }

  public void setMultiverse_id(final Integer multiverse_id) {
    this.multiverse_id = multiverse_id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getSet() {
    return set;
  }

  public void setSet(final String set) {
    this.set = set;
  }

  public String getCollector_number() {
    return collector_number;
  }

  public void setCollector_number(final String collector_number) {
    this.collector_number = collector_number;
  }
}

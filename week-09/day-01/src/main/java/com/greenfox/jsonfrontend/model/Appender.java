package com.greenfox.jsonfrontend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Appender {
  private String appended;

  public Appender(String toAppend) {
    appended = toAppend.concat("a");
  }
}

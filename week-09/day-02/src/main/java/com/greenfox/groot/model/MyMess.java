package com.greenfox.groot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyMess {
  private String received;
  private String translated;

  public MyMess(String received) {
    this.received = received;
    translated = "I am Groot!";
  }

  public MyMess() {
  }
}

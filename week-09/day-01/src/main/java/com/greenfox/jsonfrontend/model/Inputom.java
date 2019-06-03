package com.greenfox.jsonfrontend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inputom {
  private Integer received;
  private Integer result;

  public Inputom(Integer received) {
    this.received = received;
    result  = received * 2;
  }

  public Inputom() {
  }
}

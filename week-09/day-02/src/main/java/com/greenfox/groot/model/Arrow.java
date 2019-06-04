package com.greenfox.groot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Arrow {
  private Double distance;
  private Double time;
  private Double speed;

  public Arrow(Double distance, Double time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }

  public Arrow() {
  }
}

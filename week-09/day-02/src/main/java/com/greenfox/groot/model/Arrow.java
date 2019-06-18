package com.greenfox.groot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Arrow {
  private Float distance;
  private Float time;
  private Float speed;

  public Arrow(Float distance, Float time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }

  /*
   public Arrow(String distanceString, String timeString) {
    distance = Double.parseDouble(distanceString);
    time = Double.parseDouble(timeString);
    speed = distance / time;
  }
   */

  public Arrow() {
  }
}

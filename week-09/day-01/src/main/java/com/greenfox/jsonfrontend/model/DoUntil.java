package com.greenfox.jsonfrontend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoUntil {
  private int result;

  public DoUntil(String math, int untilNum) {
    result = 1;
    if (math.equals("sum")) {
      for (int i = 2; i <= untilNum; i++) {
        result += i;
      }
    } else {
      for (int i = 2; i <= untilNum; i++) {
        result *= i;
      }
    }

  }
}

package com.greenfox.jsonfrontend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoUntil {
  private int result;

  public DoUntil(String math, int untilNum) {
    if (math.equals("sum")) {
      result = getSum(untilNum);
    } else {
      result = getFactor(untilNum);
    }
  }

  public int getSum(int until) {
    result = 1;
    for (int i = 2; i <= until; i++) {
      result += i;
    }
    return result;
  }

  public int getFactor(int until) {
    result = 1;
    for (int i = 2; i <= until; i++) {
      result *= i;
    }
    return result;
  }
}

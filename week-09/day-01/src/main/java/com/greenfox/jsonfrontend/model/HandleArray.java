package com.greenfox.jsonfrontend.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class HandleArray {
  Object result;

  public HandleArray(String operation, int[] numbers) {
    if (operation.equals("sum")) {
      result = getSum(numbers);
    } else if (operation.equals("multiply")) {
      result = getMultiply(numbers);
    } else {
      result = getDouble(numbers);
    }
  }

  public int getSum(int[] numbers) {
    return Arrays.stream(numbers).sum();
  }

  public int getMultiply(int[] numbers) {
    int multiResult = 1;
    for (int num : numbers) {
      multiResult *= num;
    }
    return multiResult;
  }

  public int[] getDouble(int[] numbers) {
    int[] result = new int[numbers.length];
    for(int i = 0; i < numbers.length; i++) {
      result[i] = numbers[i] * 2;
    }
    return result;
  }
}

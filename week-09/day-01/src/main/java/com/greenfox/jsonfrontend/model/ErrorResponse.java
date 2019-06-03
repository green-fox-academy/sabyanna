package com.greenfox.jsonfrontend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
  String error;
  //String nameAndTitle;

  public ErrorResponse(int test) {
    if (test == 0) {
      error = "Please provide an input!";
    } else if (test == 1) {
      error = "Please provide a name and a title!";
    } else if (test == 2) {
      error = "Please provide a title!";
    } else if (test == 3) {
      error = "Please provide a name!";
    } else if (test == 4) {
      error = "Please provide a number!";
    } else if (test == 5) {
      error = "Please provide what to do with the numbers!";
    }
  }
}

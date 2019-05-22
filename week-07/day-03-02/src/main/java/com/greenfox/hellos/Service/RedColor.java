package com.greenfox.hellos.Service;

import org.springframework.beans.factory.annotation.Autowired;

public class RedColor implements Colorable {

  @Autowired
  private Printer printer;
  @Override
  public void printColor() {
    printer.log("It is red in color...");
  }
}

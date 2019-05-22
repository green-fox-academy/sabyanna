package com.greenfox.hellos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Black")
public class BlackColor implements Colorable {
  @Autowired
  private Printer printer;
  @Override
  public void printColor() {
    printer.log("It is black in color...");
  }
}

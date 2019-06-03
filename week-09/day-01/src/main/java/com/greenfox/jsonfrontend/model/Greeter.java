package com.greenfox.jsonfrontend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeter {

  private String Welcome_message;

  public Greeter() {
  }

  public Greeter(String name, String title) {
    Welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }
}

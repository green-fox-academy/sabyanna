package zoo;

import java.awt.*;

public class Mammal extends Animal {

  public Mammal(String name, int age, gender gender, String color) {
    super(name, age, gender, color);
  }

  @Override
  public String breed() {
    return "giving birth";
  }
}

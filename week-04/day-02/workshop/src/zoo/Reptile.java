package zoo;

import java.awt.*;

public class Reptile extends Animal {

  public Reptile(String name, int age, gender gender, String color) {
    super(name, age, gender, color);
  }

  @Override
  public String breed() {
    return "laying eggs";
  }
}

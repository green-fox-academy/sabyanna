package zoo;

import flyable.Flyable;

import java.awt.*;

public class Bird extends Animal implements Flyable {

  public Bird(String name, int age, gender gender, String color) {
    super(name, age, gender, color);
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void land() {
    System.out.println("my legs are hurting from landing");
  }

  @Override
  public void fly() {
    System.out.println("flapping my wings real hard");

  }

  @Override
  public void takeOff() {
    System.out.println("easy peasy takeoff with my wings");

  }
}

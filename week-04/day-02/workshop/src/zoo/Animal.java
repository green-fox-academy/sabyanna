package zoo;

import java.awt.*;

public abstract class Animal {
  enum gender {male, female};

  private String name;
  private int age;
  private gender gender;
  private String color;

  public Animal(String name, int age, gender gender, String color){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.color = color;
  }


  public abstract String breed();





  //gettersetters


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Animal.gender getGender() {
    return gender;
  }

  public void setGender(Animal.gender gender) {
    this.gender = gender;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}

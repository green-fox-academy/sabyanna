package clonable;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {


    Student john = new Student("John", 20, Person.gender.male, "BME");

    Student johnTheClone = john.clone();

  }
}

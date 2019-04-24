package zoo;
import zoo.Animal;


import static java.awt.Color.yellow;

public class Zoo {

  public static void main(String[] args) {

    Reptile reptile = new Reptile("Crocodile", 10, Animal.gender.female, "yellow");
    Mammal mammal = new Mammal("Koala", 10, Animal.gender.female, "green");
    Bird bird = new Bird("Parrot", 10, Animal.gender.female, "purple");

    System.out.println("How do you breed?");
    System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
    System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
    System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
  }
}
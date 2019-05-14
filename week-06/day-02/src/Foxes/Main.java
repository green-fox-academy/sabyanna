package Foxes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Fox> myFoxes = new ArrayList<>();

    myFoxes.add(new Fox("Rose", "black", 30));
    myFoxes.add(new Fox("Peter", "green", 2));
    myFoxes.add(new Fox("Kate", "white", 23));
    myFoxes.add(new Fox("Tom", "green", 1));
    myFoxes.add(new Fox("Lily", "multicolor", 99));


    myFoxes.stream()
            .filter(fox -> fox.getColor() == "green");

    List<Fox> filteredFoxes = myFoxes.stream()
            .filter(fox -> fox.getColor() == "green")
            .filter(fox -> fox.getAge() < 5)
            //.forEach(filteredFoxes::add);
            .collect(Collectors.toList());

    filteredFoxes
            .forEach(x -> System.out.println(x.getName()));

    myFoxes.stream()
            .collect(Collectors.groupingBy(Fox::getColor));

  }
}

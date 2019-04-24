package comparable;

import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Set mySet = new Set();



    /*
    for (Domino d : mySet.dominoes) {

    }
    */
    Collections.sort(mySet.dominoes);
    System.out.println(mySet.dominoes);

  }


}

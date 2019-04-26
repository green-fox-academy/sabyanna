package symmetricMatrix;

import java.lang.reflect.Array;

public class Symmetric {
  boolean result = true;

  public boolean isSymmetric(int[][] myArray) {
    boolean result = true;


    for (int i = 0; i < myArray.length; i++) {
      for (int j = 0; j < myArray[i].length; j++){
        if (myArray[i][j] != myArray[j][i]) {
          result = false;
        }
      }
    }
    System.out.println("");

    return result;
  }
}

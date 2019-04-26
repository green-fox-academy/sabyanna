package symmetricMatrix;

import java.lang.reflect.Array;

public class Symmetric {

  public void isSymmetric(int[][] myArray) {

    for (int i = 0; i < myArray.length; i++) {
      for (int j = 0; j < myArray[i].length; j++){
        System.out.print(myArray[i][j]+ " ");
      }
      System.out.println("");
    }
    

    int toCheck[][] = myArray;

    for (int i = 0; i < myArray.length; i++) {
      for (int j = 0; j < myArray[i].length; j++){
        toCheck[j][i] = myArray[i][j];
      }
    }



  }
}

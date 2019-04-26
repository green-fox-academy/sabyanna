package symmetricMatrix;

public class Main {
  public static void main(String[] args) {
    Symmetric symm = new Symmetric();

    int mat[][] = { {10, 20, 30},
            {15, 25, 35},
            {27, 29, 37,},
    };

    symm.isSymmetric(mat);


  }
}

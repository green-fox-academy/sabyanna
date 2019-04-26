package symmetricMatrix;

public class Main {
  public static void main(String[] args) {
    Symmetric symm = new Symmetric();

    int mat[][] = { {10, 20, 30},
            {15, 25, 35},
            {27, 29, 37,},
    };

    System.out.println(symm.isSymmetric(mat));

    int mat2[][] = { {10, 20, 30},
            {20, 25, 35},
            {30, 35, 37,},
    };

    System.out.println(symm.isSymmetric(mat2));


  }
}

public class DiagonalMatrix {
    public static void main(String[] args) {

        int[][] diagonal = new int [4][4];


        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if (i == j) {
                    diagonal[i][j]= 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.print("\n");
        }


            // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
    }
}

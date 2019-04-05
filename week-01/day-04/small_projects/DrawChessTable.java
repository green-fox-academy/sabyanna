public class DrawChessTable {
    public static void main(String[] args) {


        for (int i = 1; i <= 8; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= 4; j++)
                System.out.print("% ");
            } else {
                for (int j = 1; j <= 4; j++)
                    System.out.print(" %");
            }
            System.out.print("\n");
        }


        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
    }
}

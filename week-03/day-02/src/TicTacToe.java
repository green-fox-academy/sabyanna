import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file


        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

       System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"

        //ticTacResult("draw.txt");


    }

    public static String ticTacResult (String fileName) {
        Path file = Paths.get(fileName);
        int isX = 0;
        int isY = 0;

        List<String> all = new ArrayList<>();

        try {
            List<String> originalData = Files.readAllLines(file);
            String[][] tocheck = new String[3][3];
            int k = 0;
            for (String s : originalData) {

                for (int i = 0; i < 3; i++) {
                    String sti = String.valueOf(s.charAt(i));
                    tocheck[k][i] = sti;
                }
                k++;

            }
            /*
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("arr[" + i + "][" + j + "] = "
                            + tocheck[i][j]);
                }

            }

             */
            //////


            for (int i = 0; i < 3; i++) {
                StringBuilder sbf = new StringBuilder();
                for (int j = 0; j < 3; j++) {
                    sbf.append(tocheck[i][j]);
                }
                all.add(sbf.toString());

            }
            for (int i = 0; i < 3; i++) {
                StringBuilder sbf = new StringBuilder();
                for (int j = 0; j < 3; j++) {
                    sbf.append(tocheck[j][i]);
                }
                all.add(sbf.toString());
            }
            StringBuilder atl = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                atl.append(tocheck[i][i]);
            }
            all.add(atl.toString());



            StringBuilder sss = new StringBuilder();
            int m = 0;
            for (int i = 2; i >= 0; i--) {
                sss.append(tocheck[i][m]);
                m++;
            }
            all.add(sss.toString());

            //System.out.println(all.toString());






            ////


        } catch (IOException e) {
            System.out.println("nope");
        }

        if (all.contains("XXX")) {
            return "X wins";
        } else if (all.contains("OOO")) {
            return "O wins";
        } else {
            return "Its a draw";
        }

/*
        if (isY > 0) {
            return "O";
        } else if (isX > 0) {
            return "X";
        } else {
            return "Draw";
        }



 */

    }
}
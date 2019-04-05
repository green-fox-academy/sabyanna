import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your number? ");

        int nr = scanner.nextInt();

        int i;
        for (i = 1; i <= nr; i++) {
            System.out.print("%");
        }

        System.out.print("\n");

        int j,k,l;
        for (j = 0; j <= nr - 3; ++j) {
            System.out.print("%");

            for (k = 0; k <= j - 1; k++) {
                System.out.print(" ");
            }
            System.out.print("%");

            for (l = 0; l < (nr - j - 3); l++) {
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.print("\n");

        }

        for (i = 1; i <= nr; i++) {
            System.out.print("%");
        }



        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        /*
        OOOOOO
        OO   O
        O O  O
        O  O O
        O   OO
        OOOOOO

         */
        //
        // The square should have as many lines as the number was

    }
}

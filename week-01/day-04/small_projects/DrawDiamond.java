import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's size should your diamond be? ");

        int nr = scanner.nextInt();

        int i;
        int star;
        int j;
        int k;
        int l;

        for (i = 1; i <= (nr + 1) / 2; i++) {
            for (j = 1; j <= ((nr + 1) / 2) - i + 1; j++) {
                System.out.print(" ");
            }
            for (star = 1; star <= 1 + (i - 1) * 2; star++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

        for (i = 1; i <= nr /2; i++) {
            for (j = 1; j < i + 2; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= nr - i * 2; k++) {
                System.out.print("*");
            }

            System.out.print("\n");

        }


        /*
        int col = 1 + (ln - 1) * 2;

        int i;
        int star;
        int j;
        int k;
        int l;
        for (i = 1; i <= ln; i++) {
            for (j = 1; j <= ln - i; j++) {
                System.out.print(" ");
            }
            for (star = 1; star <= 1 + (i - 1) * 2; star++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        */

        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *      - 4-1      -1
        //   ***     - 3-3      -2
        //  *****    - 2-5      -3
        // *******   - 1-7      -4
        //  *****    - 2-5      -1
        //   ***     - 3-3      -2
        //    *      - 4-1      -3
        //
        //nr - 2i
        //nr - 2i
        // The diamond should have as many lines as the number was
    }
}

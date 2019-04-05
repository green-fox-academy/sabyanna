import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("What size should your pyramid be? ");
        int ln = scanner.nextInt();

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


        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        // (col - 1) / 2 - i
        //
        //    *     - 3
        //   ***    - 2
        //  *****   - 1
        // *******  - 0
        //
        // The pyramid should have as many lines as the number was
    }
}

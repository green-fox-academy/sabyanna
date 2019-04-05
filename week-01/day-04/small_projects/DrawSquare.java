import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's size should your square be? ");

        int nr = scanner.nextInt();

        int i;
        int hash;
        for (i = 1; i <= nr; i++) {
            if ((i == 1) || (i == nr)) {
                for (hash = 1; hash <= nr; hash++) {
                    System.out.print("%");
                }

            } else {
                for (hash = 1; hash <= nr; hash++) {
                    if ((hash == 1) || (hash == nr)) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }



        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was
    }
}

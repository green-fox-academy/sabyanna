import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int myNum = 7;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number! ");

        int nr = scanner.nextInt();

        do {
            if (myNum < nr) {
                System.out.println("The stored number is lower");
                nr = scanner.nextInt();
            } else if (myNum > nr) {
                System.out.println("The stored number is higher");
                nr = scanner.nextInt();
            }

        } while (nr != myNum);

        System.out.println("You guess the number " + myNum);





        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

    }
}

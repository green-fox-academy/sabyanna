import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        System.out.println("Your number is: ");

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        if (userInput % 2 != 0){
            System.out.println("Your number is odd!");
        } else {
            System.out.println("Your number is Even!");
        }




    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.
    }
}

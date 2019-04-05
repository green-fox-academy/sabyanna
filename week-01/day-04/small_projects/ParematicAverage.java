import java.util.Scanner;

public class ParematicAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many integers? ");

        int times = scanner.nextInt();

        int sum = 0;
        int i;

        for (i = 1; i <= times; i++) {
            System.out.println("Enter integer: ");
            sum = sum + scanner.nextInt();
        }
        System.out.println("Sum: " + sum + ", Average: " + (float)(sum / times));


        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
    }
}

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        System.out.println("What's your first number? ");
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();

        System.out.println("What's your second number? ");
        Scanner scanner2 = new Scanner(System.in);
        int nr2 = scanner2.nextInt();

        System.out.println("What's your third number? ");
        Scanner scanner3 = new Scanner(System.in);
        int nr3 = scanner.nextInt();

        System.out.println("What's your forth number? ");
        Scanner scanner4 = new Scanner(System.in);
        int nr4 = scanner.nextInt();

        System.out.println("What's your fifth number? ");
        Scanner scanner5 = new Scanner(System.in);
        int nr5 = scanner.nextInt();

        int sum = (nr1 + nr2 + nr3 + nr4 + nr5);

        System.out.println("Sum: " + sum + ", Average: " + (float)(sum / 5));
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
    }
}

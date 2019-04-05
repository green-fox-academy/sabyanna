import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstn;
        int secondn;


        do {
            System.out.println("What's your first number? ");
            firstn = scanner.nextInt();

            System.out.println("What's your second number? ");
            secondn = scanner.nextInt();
        } while (secondn <= firstn);

        while (firstn <= secondn) {
            System.out.println(firstn);
            ++firstn;
        }

        /*
        if (firstn >= secondn) {
            System.out.println("The second number should be bigger!");
        } else {
            while (firstn <= secondn) {
                System.out.println(firstn);
                ++firstn;
            }
        }

        do {
            if (firstn >= secondn) {
                System.out.println("The second number should be bigger!");
            } else {
                while (firstn <= secondn) {
                    System.out.println(firstn);
                    ++firstn;
                }
            }
        }

         */


        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
    }
}

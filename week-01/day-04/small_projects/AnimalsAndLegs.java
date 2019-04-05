import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        System.out.println("How many chickens does the farmer have? ");
        Scanner scanner = new Scanner(System.in);
        int chic = scanner.nextInt();

        System.out.println("How many pigs does the farmer have? ");
        Scanner scanner2 = new Scanner(System.in);
        int pig = scanner2.nextInt();

        System.out.println("They have " + (chic * 2 + pig * 4) + " legs.");


        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}
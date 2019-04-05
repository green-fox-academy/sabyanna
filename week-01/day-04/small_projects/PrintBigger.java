import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("What is your first number? ");
        int frst = scanner.nextInt();

        Scanner scanner2 = new Scanner (System.in);
        System.out.println("What is your second number? ");
        int scnd = scanner.nextInt();

        if (frst > scnd) {
            System.out.println(frst);
        } else if (frst < scnd) {
            System.out.println(scnd);
        } else {
            System.out.println("The two numbers are equal");
        }


        // Write a program that asks for two numbers and prints the bigger one
    }
}

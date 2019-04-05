import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        System.out.println("Your miles are: ");
        Scanner scanner = new Scanner(System.in);

        int miles = scanner.nextInt();
        System.out.println(miles + " miles in kilometers is: " + (miles * 1.60934));

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}
import java.util.Scanner;
public class chess {
    public static void  main (String[] args) {
        int myNumber;

        int a, b, c, d;
        a = 10;
        b = 20;

        c = a + b;

        d = c + b;

        System.out.println(d);

        byte verySmallNumber; // +-128
        short smallNumber; // +-32000
        int averageNumber; // 32bit
        long largeNumber; //64bit

        float averageDecimal = 1.01201f; //32bit need the f at the end to tell it that its not a double
        double largeDecimal; //64bit

        boolean trueFalse = true; // true/false

        char character = 'k'; // 1 character  '' not ""

        String message = "This is a tutorial number 3";
        System.out.println(message);

        String message2 = "This " + "is " + a;
        System.out.println(message2);

        Scanner input = new Scanner(System.in); /*before we can ask for input we have to create
        a scanner class to read input from system input*/

        System.out.println("Enter an amount in double format (pl 12.05): ");
        double amount = input.nextDouble();

        int whole = (int) (amount * 100);

        System.out.println("Whole: " + whole);

        int dollars = (int) (whole / 100);

        int remainingAmount = (int) (whole % 100);


        remainingAmount = remainingAmount % 100;

        System.out.println("Remaining amount is: " + remainingAmount);

        System.out.println("Remaining dollars: " + dollars);









    }
}

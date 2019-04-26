import java.util.Scanner;

public class CabMain {
  public static void main(String[] args) {
    CAB cab = new CAB(1234);
    Scanner scanner = new Scanner(System.in);
    System.out.println("What's your guess: ");
    String n = scanner.nextLine();

    if (cab.guess(n) == "Cows")

    cab.counter++;



    System.out.println();

  }
}

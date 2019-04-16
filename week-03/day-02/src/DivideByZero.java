import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        divideTenWith(0);
    }

    public static void divideTenWith (int divider) {
        try {
            int result = 10 / divider;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }

}

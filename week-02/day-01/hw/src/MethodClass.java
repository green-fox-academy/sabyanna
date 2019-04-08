import java.util.Scanner;

public class MethodClass {

    static double myPI = 3.14159; //Class Variable

    public static void main(String[] args) {
        int d = 5;  // local to the main function
        tryToChange(5);  //you call a method --> the tryTo will be printed first


        System.out.println("main d = " + d);
    }

    public static void tryToChange (int d) { //int d declared a new version of d
        d = d + 1;
        System.out.println("tryToChange d = " + d);
    }

    //the two d-s are not going to be equal because they are in separate methods

}

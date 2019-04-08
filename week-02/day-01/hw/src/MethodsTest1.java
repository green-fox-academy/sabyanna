import java.util.Scanner;

public class MethodsTest1 {

    //class variable - static: it is accessible from other classes
    //and its going to be accessible to other functions within
    //this program

    static double myPI = 3.14159;  //class variable - accessible anywhere within this class

    public static void main(String[] args) {

        addThem(1, 2);

        System.out.println("Global " + myPI);

        /*
        static is used whenever you want to be able to execute a method
        that isn't part of a class definition
        method syntax:


        accessModifier static returnType methodName (parameters/argumetns)

        */



    }

    /* returns an integer, name addThem, parameters: int a, int b;

     */

    public static int addThem(int a, int b){

        double smallPI = 3.140; // local variable - only accessible inside addThem

        double myPI = 3.0;

        System.out.println("Local " + myPI);

        return 1;

        /* you can use the class variables anywhere however you can also
        overwrite their values, but here it is a local change so outside
        of the method it will not be changed
         */
    }
}

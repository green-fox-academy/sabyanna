import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test {


    public static void main(String[] args) {



        //-----------------------------------------------------------------------
        //LINE

        int k = 1;
        while(k <= 41) {
            System.out.print("-");
            k++;
        }
        System.out.println();


        //------------------------------------------------------------------------

        int test3[] = new int[10];


        for(int j = 0; j < test3.length; j++) {
            System.out.print("|" + j + " ");
        }
        System.out.println("|");

        //-------------------------------------------------------------------------------
        //LINE

        k = 1;
        while(k <= 61) {
            System.out.print("-");
            k++;
        }
        System.out.println();
        //------------------------------------------------------------------------------

        //multidimensional arrays

        String multiArray[][] = new String[10][10];

        for(int i = 0; i <multiArray.length; i++){
            for(int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i + " " + j;
            }
        }



        for(int i = 0; i <multiArray.length; i++){
            for(int j = 0; j < multiArray[i].length; j++) {
                System.out.print("|" + multiArray[i][j] + " " );
            }
            System.out.println("|");

        }

        int numberArray[] = new int[10];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        //print array

        for (int row: numberArray) {
            System.out.print(row);
        }
        System.out.print("\n");

        //print multidim array

        for(String[] rows : multiArray) {
            for (String column : rows) {
                System.out.print("|" + column + " " );
            }
            System.out.println('|');
        }

        System.out.print("\n");



        //copies out the first 5 indexes out numberArrays
        int[] numberCopy = Arrays.copyOf(numberArray, 5);

        for (int row: numberCopy) {
            System.out.print(row);
        }
        System.out.print("\n");

        //copies a range

        int[] number2Copy = Arrays.copyOfRange(numberArray, 3, 6);

        for (int row: number2Copy) {
            System.out.print(row);
        }
        System.out.print("\n");

        System.out.println(Arrays.toString(number2Copy));

        //----------------------------------

        //assigns the numbr 2 to all indexes


        int[] moreNumbers = new int[100];

        Arrays.fill(moreNumbers, 2);

        //fill in multidimensonal

        char[][] boardGame = new char [10][10];
        for(char[] row : boardGame) {
            Arrays.fill(row, '*');
        }

        for(char[] rows : boardGame) {
            for (char column : rows) {
                System.out.print("|" + column + " " );
            }
            System.out.println('|');
        }

        System.out.print("\n");

        //--------------------------------------
        // sort an array

        int[] numToSort = new int[10];

        //assigns random értékek

        for(int i = 0; i < 10; i++) {
            numToSort[i] = (int) (Math.random() * 100);
        }

        //sort them in ascending order
        Arrays.sort(numToSort);

        System.out.println(Arrays.toString(numToSort));

        //binary search: returns the index for the search value, otherwise returns A negative number
        //I want to find the value of 50 if it exists


        int whereIs50 = Arrays.binarySearch(numToSort, 50);
        System.out.println(whereIs50);




























    }
}

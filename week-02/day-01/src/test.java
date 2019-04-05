import java.util.Arrays;

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

















    }
}

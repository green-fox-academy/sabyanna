

public class bool {
    public static void  main (String[] args) {

        //Equal to                     ==
        //Greater than                 >
        //Greater than or equal to     >=
        //Less than                    <
        //Less than or equal to        <=
        //Not equal to                 !=
        //AND                          &&
        //OR                           ||

        boolean a = (2 == 2);

        System.out.println(a);

        /*
        if (condition is true) {
            do this code here
        }
        */

        if(true){
            System.out.println("Condition is true");
        }


        boolean x = (11 - 1 == 10);
        if(x){
            System.out.println("Condition is true");
        }

        int m = 11;
        int n = 10;


        if(m > n){
            System.out.println("m bigger than n");
        }
        else if(m < n){
            System.out.println("m smaller than n");
        }
        else {
            System.out.println("m equals n");
        }

        boolean z = (true) && (false) || (true);
        System.out.println("true");

    }
}


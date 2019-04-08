public class Sum {
    public static void main(String[] args) {

        System.out.println(sum(5));



        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
    }

    public static int sum(int a) {
        int summ = 0;
        for(int i = 0; i <= a; i++) {
            summ += i;
        }
        return summ;
    }
}

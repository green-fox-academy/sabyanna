public class Factorio {
    public static void main(String[] args) {

        System.out.println(factorio(4));



        // - Create a function called `factorio`
        //   that returns it's input's factorial

    }

    public static int factorio(int a) {
        int fact = 1;
        for(int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
}

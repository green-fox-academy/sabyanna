public class Bunies {
    public static void main(String[] args) {
        //We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies
        // recursively (without loops or multiplication).

        System.out.println(bunnies(30));

    }

    public static int bunnies (int n) {
                if (n == 0) {
            return 0;
        } else {
            return bunnies(n-1) + 2;
        }
    }

}

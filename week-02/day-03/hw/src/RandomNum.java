public class RandomNum {
    public static void main(String[] args) {
        int max = 10;
        int min = 5;
        int range = max - min;
        int randomInt = (int) ((Math.random() * (range) + min));

        System.out.println(randomInt);

        for (int i = 0; i <=10; i++) {
            System.out.println((int) ((Math.random() * (range) + min)));
        }



    }
}

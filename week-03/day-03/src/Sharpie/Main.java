package Sharpie;

public class Main {
    public static void main(String[] args) {
        SharpieSet sharpies = new SharpieSet();

        System.out.println(sharpies.countUsable());

        sharpies.removeTrash();

        System.out.println(sharpies.getSharpieSet());


    }

}

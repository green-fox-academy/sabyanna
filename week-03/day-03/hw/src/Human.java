public class Human {
    String name;
    int age;
    int heightInCm;
    String eyeColor;

    public Human(){   //constructor method, comes for all classes automatically

    }


    public void speak(){
        System.out.println("Hello, my name is: " + name);
        System.out.println(("I am " + heightInCm));
        System.out.println("my eyes are: " + eyeColor);
    }

    public void eat() {
        System.out.println("eating....");
    }

    public void walking(){
        System.out.println("walking....");
    }

    public void work() {
        System.out.println("working...");
    }

}

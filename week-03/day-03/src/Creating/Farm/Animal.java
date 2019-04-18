package Creating.Farm;

public class Animal {
    int hunger = 50;
    int thirst = 50;
    String name;

    @Override
    public String toString() {
        return name;
    }

    public Animal(String name, int hunger) {
        this.name = name;
        Farm.numberOfAnimals++;
        this.hunger = hunger;
    }



    public void eat() {

        this.hunger--;
    }

    public void drink() {

        this.thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }


}

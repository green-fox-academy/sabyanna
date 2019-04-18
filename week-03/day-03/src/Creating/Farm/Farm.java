package Creating.Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    public static int numberOfAnimals = 0;
    List<Animal> farmAnimals = new ArrayList<>();
    static int slots = 10;

    Farm() {
        initializeFarm();
    }

    public  void breed() {

        if (numberOfAnimals < slots) {
            for (int i = numberOfAnimals+1; i <= slots; i++) {
                StringBuilder sb = new StringBuilder("animal");
                sb.append(i);
                String name = sb.toString();
                Animal animal = new Animal(name, 30);
                farmAnimals.add(animal);
            }
        }

    }

    public List<Animal> getFarm() {
        return farmAnimals;
    }

    public void slaughter() {
        List<Animal> newFarm = new ArrayList<>();
        int toRemove = 0;
        int max = 0;
        for (int i = 0; i < farmAnimals.size(); i++) {
            if (farmAnimals.get(i).hunger > max) {
                max = farmAnimals.get(i).hunger;
                toRemove = i;
            }
        }
        for (int i = 0; i < farmAnimals.size(); i++) {
            if (i != toRemove) {
                newFarm.add(farmAnimals.get(i));
            }
        }
        farmAnimals = newFarm;
        numberOfAnimals--;


    }

    void initializeFarm() {
        farmAnimals.add(new Animal("animal1", 10));
        farmAnimals.add(new Animal("animal2", 50));
        farmAnimals.add(new Animal("animal3", 20));
        farmAnimals.add(new Animal("animal4", 23));


    }



}

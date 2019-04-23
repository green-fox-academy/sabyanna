package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> garden;



  public Garden() {
    garden = new ArrayList<>();
  }

  void add(Plant plant) {
    garden.add(plant);
  }


  public void watering(int amount) {
    System.out.println("Watering with " + amount);
    int waterables = 0;
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).isNeedsWater()) {
        waterables++;
      }
    }

    for (int j = 0; j < garden.size(); j++) {
      if (garden.get(j).isNeedsWater()) {
        garden.get(j).watering(amount/waterables);
      }

    }


  }

  public void info() {
    for (int i = 0; i < garden.size(); i++) {
      if ((garden.get(i).isNeedsWater() && (garden.get(i) instanceof Flower))) {
        System.out.println("The " + garden.get(i).getName() + " flower needs watering ");
      } else if (!(garden.get(i).isNeedsWater()) && (garden.get(i) instanceof Flower)) {
        System.out.println("The " + garden.get(i).getName() + " flower does not need watering ");
      } else if ((garden.get(i).isNeedsWater() && (garden.get(i) instanceof Tree))) {
        System.out.println("The " + garden.get(i).getName() + " tree needs watering ");
      } else if (!((garden.get(i).isNeedsWater()) && (garden.get(i) instanceof Tree))) {
        System.out.println("The " + garden.get(i).getName() + " tree does not need watering ");
      }
    }
  }




}

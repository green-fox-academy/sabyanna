package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> ship= new ArrayList<Pirate>();

  public void add(BasicPirate pirate){
    ship.add(pirate);
  }

  public void add(Captain captain){
    boolean needCaptain = false;
    for (Pirate pirate: ship){
      if (pirate instanceof Captain) {
        needCaptain = true;
      }
    }
    if (needCaptain){
      ship.add(captain);
    } else {
      System.out.println("We already have a captain, mate.");
    }
  }

  public List<String> getPoorPirates() {
    List<String> poorPirates = new ArrayList<>();
    for (Pirate pirate: ship) {
      if (pirate.isWoodenLeged() && pirate.getGold() < 15) {
        poorPirates.add(pirate.getName());
      }
    }
    return poorPirates;
  }

  public void lastDayOnTheShip() {
    for (Pirate pirate: ship) {
      pirate.party();
    }
  }

  //how to call lastDayOnTheShip

  public void prepareForBattle() {
    for (Pirate pirate: ship) {
      for (int i = 0; i < 5; i++){
        pirate.work();
      }
    }
    for (Pirate pirate: ship) {
      pirate.party();
    }
  }
}

package aircraftCarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Carrier {
  private int store;
  private int HP;
  List<Aircraft> carrier = new ArrayList<>();

  public Carrier(int store, int HP) {
    this.store = store;
    this.HP = HP;
  }

  public void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public void fill() {
    if (store == 0) {
      throw new NoSuchElementException();
    } else {
      if (getAllAmmo() <= store) {
        for (int i = 0; i < carrier.size(); i++ ){
          store = carrier.get(i).refill(store);
        }
      } else {
        for (int j = 0; j< carrier.size(); j++){
          if (carrier.get(j).isPriority()) {
            store = carrier.get(j).refill(store);

          }
        }
        for (int j = 0; j< carrier.size(); j++){
          if (!(carrier.get(j).isPriority())) {
            store = carrier.get(j).refill(store);

          }
        }
      }
    }



  }

  public void fight(Carrier anotherCarrier){
    anotherCarrier.setHP(anotherCarrier.getHP()-getAllDamage());
    for (int i = 0; i < carrier.size(); i++){
      carrier.get(i).setAmmunition(0);
    }
  }





  //gettersSetters

  public void getStatus(){
    if (HP > 0) {
      System.out.println("HP: " + HP + ", Aircraft count: " + carrier.size() + ", Ammo Storage: " + store + ", Total damage: " + getAllDamage());
      System.out.println("Aircrafts:");
      for (int i = 0; i < carrier.size(); i++) {
        System.out.println(carrier.get(i).getStatus());
      }
    } else {
      System.out.println("It's dead Jimmy");
    }

  }

  public int getAllAmmo(){
    int allAmmo = 0;
    for (int i = 0; i < carrier.size(); i++) {
      allAmmo += carrier.get(i).getMaxAmmo()-carrier.get(i).getAmmunition();
    }
    return allAmmo;
  }

  public int getAllDamage(){
    int dam = 0;
    for (int i = 0; i < carrier.size(); i++) {
      dam += carrier.get(i).getBaseDamage() * carrier.get(i).getAmmunition();
    }
    return dam;
  }

  public int getStore() {
    return store;
  }

  public void setStore(int store) {
    this.store = store;
  }

  public int getHP() {
    return HP;
  }

  public void setHP(int HP) {
    this.HP = HP;
  }

  public List<Aircraft> getCarrier() {
    return carrier;
  }

  public void setCarrier(List<Aircraft> carrier) {
    this.carrier = carrier;
  }
}

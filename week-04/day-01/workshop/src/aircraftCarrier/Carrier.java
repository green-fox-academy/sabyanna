package aircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private int store;
  private int HP;
  List<Aircraft> carrier = new ArrayList<>();

  public Carrier(int store, int HP) {
    this.store = store;
    this.HP = HP;
  }

  public void fill() {
    if (getAllAmmo() <= store) {
      for (int i = 0; i < carrier.size(); i++ ){
        store =carrier.get(i).refill(store);
      }
    } else {
      for (int j = 0; j< carrier.size(); j++){
        if (carrier.get(j).isPriority()){
          store = carrier.get(j).refill(store);
        }
      }
    }
    for (int j = 0; j< carrier.size(); j++){
        store = carrier.get(j).refill(store);
    }
  }





  //gettersSetters

  public int getAllAmmo(){
    int allAmmo = 0;
    for (int i = 0; i < carrier.size(); i++) {
      allAmmo += carrier.get(i).getMaxAmmo()-carrier.get(i).getAmmunition();
    }
    return allAmmo;
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

package garden;

public class Flower extends Plant{

  public Flower(String name){
    super(name);

  }


  @Override
  public void watering(double amount){
    setWaterLevel(getWaterLevel()+ amount*0.7);
    if (getWaterLevel() >= 5) {
      setNeedsWater(false);
    }
  }
}

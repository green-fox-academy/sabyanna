package garden;

public class Tree extends Plant {

  public Tree(String name) {
    super(name);
  }


  @Override
  public void watering(double amount){
    setWaterLevel(getWaterLevel()+ amount*0.4);
    if (getWaterLevel() >= 10) {
      setNeedsWater(false);
    }
  }



}

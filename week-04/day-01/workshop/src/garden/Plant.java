package garden;

public class Plant {
  private String name;
  private double waterLevel;
  private boolean needsWater;

  public Plant(String name) {
    this();
    this.name = name;
  }

  public Plant(){
    waterLevel = 0;
    needsWater = true;
  }

  public void watering(double amount){
  }

  public String getName() {
    return name;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public boolean isNeedsWater() {
    return needsWater;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public void setNeedsWater(boolean needsWater) {
    this.needsWater = needsWater;
  }
}

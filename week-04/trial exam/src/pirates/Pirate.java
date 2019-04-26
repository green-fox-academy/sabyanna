package pirates;

public abstract class Pirate{
  private String name;
  private int gold;
  private int HP;
  private boolean woodenLeged;

  public Pirate(String name, int gold, boolean hasWoodenLeg){
    this.name = name;
    this.gold = gold;
    this.woodenLeged = hasWoodenLeg;
    int HP = 10;
  }


  public String toString() {
    String myReturn;
    if (woodenLeged) {
      myReturn = "Hello I'm " + name + ". I have a wooden leg and " + gold + " golds.";
    } else {
      myReturn = "Hello I'm " + name + ". I still have my real leg and " + gold + " golds.";
    }
    return myReturn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGold() {
    return gold;
  }

  public void setGold(int gold) {
    this.gold = gold;
  }

  public int getHP() {
    return HP;
  }

  public void setHP(int HP) {
    this.HP = HP;
  }

  public boolean isHasWoodenLeg() {
    return woodenLeged;
  }

  public void setHasWoodenLeg(boolean hasWoodenLeg) {
    this.woodenLeged = hasWoodenLeg;
  }
}

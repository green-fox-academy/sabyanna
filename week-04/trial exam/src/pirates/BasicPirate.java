package pirates;

public class BasicPirate extends Pirate  implements Pirateable{

  public BasicPirate(String name, int gold, boolean hasWoodenLeg) {
    super(name, gold, hasWoodenLeg);
  }


  @Override
  public void work() {
    setGold(getGold() + 1);
    setHP(getHP() - 1);
  }

  @Override
  public void party() {
    setHP(getHP() + 1);
  }
}

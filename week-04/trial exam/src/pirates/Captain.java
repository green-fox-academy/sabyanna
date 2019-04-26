package pirates;

public class Captain extends Pirate implements Pirateable{
  public Captain(String name, int gold, boolean hasWoodenLeg) {
    super(name, gold, hasWoodenLeg);
  }

  @Override
  public void work() {
    setGold(getGold() + 10);
    setHP(getHP() - 5);
  }

  @Override
  public void part() {
    setHP(getHP() + 10);
  }
}

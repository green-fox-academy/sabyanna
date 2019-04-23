package aircraftCarrier;

public class F35 extends Aircraft {
  public F35(){
    super();
    setMaxAmmo(12);
    setBaseDamage(50);
    setPriority(true);
  }

  @Override
  public String getType(){
    return "F35";
  }
}

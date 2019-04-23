package aircraftCarrier;

public class F16 extends Aircraft{
  public F16(){
    super();
    setMaxAmmo(8);
    setBaseDamage(30);
    setPriority(false);
  }

  @Override
  public String getType(){
    return "F16";
  }
}

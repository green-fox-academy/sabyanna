package aircraftCarrier;

public class F16 extends Aircraft{
  public F16(){
    super();
    setMaxAmmo(8);
    setBaseDamage(30);
  }

  @Override
  public String getType(){
    return "F16";
  }
}

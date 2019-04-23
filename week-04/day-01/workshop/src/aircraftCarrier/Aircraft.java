package aircraftCarrier;

public class Aircraft {

  private int ammunition;
  private int maxAmmo;
  private int baseDamage;
  private int allDamage;

  public Aircraft(){
    ammunition = 0;
  }

  public int fight(){
    allDamage = ammunition * baseDamage;
    ammunition = 0;
    return allDamage;
  }

  public int refill(int ammo) {
    ammo -= maxAmmo - ammunition;
    ammunition = maxAmmo;
    return ammo;
  }

  public String getType() {
    return getClass().toString();
  }

  public String getStatus() {
    allDamage = ammunition * baseDamage;
    return ("Type " + getType() + ", Ammo: " + ammunition + ", Base Damage: " + baseDamage + ", All Damage = " + allDamage);
  }

  public boolean isPriority(){
    boolean isit = false;
    if (getClass().equals("F35")){
      isit = true;
    } else if (getClass().equals("F16")){
      isit = false;
    }
    return isit;
  }

  //gettersSetters

  public int getAmmunition() {
    return ammunition;
  }

  public void setAmmunition(int ammunition) {
    this.ammunition = ammunition;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getAllDamage() {
    return allDamage;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public void setAllDamage(int allDamage) {
    this.allDamage = allDamage;
  }
}

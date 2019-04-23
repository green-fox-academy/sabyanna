package aircraftCarrier;

public class Aircraft {

  private int ammunition;
  private int maxAmmo;
  private int baseDamage;
  private int allDamage;
  private boolean isPriority;

  public Aircraft(){
    ammunition = 0;
  }

  public int fight(){
    allDamage = ammunition * baseDamage;
    ammunition = 0;
    return allDamage;
  }

  public int refill(int ammo) {
    if (maxAmmo - ammunition <= ammo) {
      ammo -= maxAmmo - ammunition;
      ammunition = maxAmmo;
    } else {
      ammunition = ammo;
      ammo = 0;
    }

    return ammo;
  }

  public String getType() {
    return "none";
  }

  public String getStatus() {
    allDamage = ammunition * baseDamage;
    return ("Type: " + getType() + ", Ammo: " + ammunition + ", Base Damage: " + baseDamage + ", All Damage = " + allDamage);
  }

  public boolean isPriority(){
    return isPriority;
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

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public void setAllDamage(int allDamage) {
    this.allDamage = allDamage;
  }

  public void setPriority(boolean priority) {
    isPriority = priority;
  }
}

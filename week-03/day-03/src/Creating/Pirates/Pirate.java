package Creating.Pirates;

public class Pirate {

    public String name;
    public String isDrunk = "sober";
    public int drunkness = 0;
    public boolean isCaptain;
    public boolean isAlive = true;

    @Override
    public String toString() {
        return name + ": " + drunkness;
    }

    public Pirate(String name, boolean isCaptain){
        this.name = name;
        this.isCaptain = isCaptain;
    }



}

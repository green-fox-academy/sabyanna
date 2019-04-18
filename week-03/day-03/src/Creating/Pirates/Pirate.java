package Creating.Pirates;

public class Pirate {

    public String name;
    public int drunkness = 0;
    public boolean isCaptain;
    public String isAlive = "alive";

    @Override
    public String toString() {
        return name + ": " + drunkness +", " + isAlive;
    }

    public Pirate(String name, boolean isCaptain){
        this.name = name;
        this.isCaptain = isCaptain;
    }

    void die() {
        name = "dead";
    }







}

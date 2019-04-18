package Creating.Pirates;

public class Pirate {

    public String name;
    public int drunkness = 0;
    public boolean isCaptain;
    public String isAlive = "alive";

    int randomWithRange(int min, int max)
    {
        int range = Math.abs(max - min) + 1;
        return (int)(Math.random() * range) + (min <= max ? min : max);
    }


    public Pirate(String name, boolean isCaptain){
        this.name = name;
        this.isCaptain = isCaptain;
    }

    void die() {
        name = "dead";
    }

    void brawl(Pirate otherPirate) {
        if ((this.isAlive=="alive" || this.isAlive=="out") && (otherPirate.isAlive=="alive" || otherPirate.isAlive=="out")) {
            int random = randomWithRange(1, 3);
            if (random == 1) {
                this.isAlive = "dead";
            } else if (random == 2) {
                otherPirate.isAlive = "dead";
            } else {
                this.isAlive = "out";
                otherPirate.isAlive = "out";
            }
        } else {
            System.out.println("We need two alive pirates");
        }


    }

    void howsItGoingMate() {
        if (this.isAlive == "dead") {
            System.out.println("He's dead mate...");
        } else if (this.isAlive == "out") {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        } else {
            System.out.println("Pour me anudder!");
            this.drinkSomeRum();
            if (this.drunkness >= 4) {
                this.isAlive = "out";
            }
        }
    }

    void drinkSomeRum() {
        this.drunkness++;
        if (this.drunkness >= 4) {
            this.isAlive = "out";
        }
    }



    @Override
    public String toString() {
        return name + ": " + drunkness +", " + isAlive;
    }
}

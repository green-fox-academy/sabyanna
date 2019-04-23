package garden;

public class Main {
  public static void main(String[] args) {
    Garden myGarden = new Garden();

    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");


    myGarden.add(yellow);
    myGarden.add(blue);
    myGarden.add(purple);
    myGarden.add(orange);

    myGarden.info();

    myGarden.watering(40);

    myGarden.info();

    System.out.println("");

    myGarden.watering(70);
    myGarden.info();




  }

}

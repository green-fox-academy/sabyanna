package Creating.Farm;

public class Main {
    public static void main(String[] args) {

        Farm myFarm = new Farm();

        myFarm.breed();

        System.out.println(myFarm.getFarm());


        myFarm.slaughter();


        System.out.println(myFarm.getFarm());
        myFarm.slaughter();
        System.out.println(myFarm.getFarm());
        System.out.println(myFarm.numberOfAnimals);


        myFarm.breed();
        System.out.println(myFarm.getFarm());


    }

}

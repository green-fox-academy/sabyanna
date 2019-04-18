package PetrolStation;

public class Main {
    public static void main(String[] args) {
        Station station = new Station();
        Car car = new Car();

        station.refill(car);

        System.out.print("Station gas: " );
        Station.checkGas();

        System.out.print("Car gas: " );
        car.checkGas(car);


    }




}

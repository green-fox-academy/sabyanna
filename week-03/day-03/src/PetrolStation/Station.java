package PetrolStation;

public class Station {
    static int gasAmountS = 5000;

    public void refill(Car car) {
        gasAmountS-=car.capacity;
        car.gasAmountC = car.capacity;
    }

    public static void checkGas() {
        System.out.println(gasAmountS);
    }
}

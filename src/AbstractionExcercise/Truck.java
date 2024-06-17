package AbstractionExcercise;

public class Truck extends Vehicle {

    @Override
    public void acelerate() {
        System.out.println("\nTruck starts moving...");
    }

    @Override
    public void stop() {
        System.out.println("Truck stops...");
    }

    @Override
    public void chargeGas() {
        System.out.println("Truck charges gas...\n");
    }

}

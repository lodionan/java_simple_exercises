package AbstractionExcercise;

public class Car extends Vehicle {

    @Override
    public void acelerate() {
        System.out.println("\nCar starts moving...");
    }

    @Override
    public void stop() {
        System.out.println("Car stops...");
    }

    @Override
    public void chargeGas(){
        System.out.println("Car charges gas...\n");
    }

}

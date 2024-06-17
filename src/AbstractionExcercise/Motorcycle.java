package AbstractionExcercise;

public class Motorcycle extends Vehicle {

    @Override
    public void acelerate() {
        System.out.println("\nMotorcycle starts moving...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stops...");
    }

    @Override
    public void chargeGas() {
        System.out.println("Motorcycle charges gas...\n");
    }
}

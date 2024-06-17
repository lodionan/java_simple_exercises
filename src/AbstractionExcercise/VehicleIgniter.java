package AbstractionExcercise;

public class VehicleIgniter {
    public static void main(String[] args) {

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();

        car.acelerate();
        car.stop();
        car.chargeGas();

        motorcycle.acelerate();
        motorcycle.stop();
        motorcycle.chargeGas();

        truck.acelerate();
        truck.stop();
        truck.chargeGas();

    }
}

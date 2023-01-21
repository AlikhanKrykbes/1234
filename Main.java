public class Main {
    public static void main(String[] args) {
        Locomotive loco = new Locomotive(1, 5000);
        PassengerCar passCar = new PassengerCar(40, 50);
        FreightCar freightCar = new FreightCar(100, 10000);

        passCar.addPassenger();
        passCar.addPassenger();
        System.out.println("Passenger count: " + passCar.getPassengerCount()); // 2
        System.out.println("Power: " + loco.getPower()); // 5000
        System.out.println("Weight capacity: " + freightCar.getWeightCapacity()); // 10000
    }
}
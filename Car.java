public class Car {
    private int capacity;
    private int passengerCount;

    public Car(int capacity) {
        this.capacity = capacity;
        this.passengerCount = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void addPassenger() {
        if (passengerCount < capacity) {
            passengerCount++;
        } else {
            System.out.println("Car is full");
        }
    }
}

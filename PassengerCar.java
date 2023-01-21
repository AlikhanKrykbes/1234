class PassengerCar extends Train {
    int numOfSeats;

    public PassengerCar(int totalCapacity, int numOfSeats) {
        super(totalCapacity);
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }
}
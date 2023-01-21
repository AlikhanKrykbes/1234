class Train {
    int totalCapacity;
    int passengerCount;

    public Train(int totalCapacity) {
        this.totalCapacity = totalCapacity;
        passengerCount = 0;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void addPassenger() {
        if (passengerCount < totalCapacity) {
            passengerCount++;
        } else {
            System.out.println("Train is full.");
        }
    }

    public void removePassenger() {
        if (passengerCount > 0) {
            passengerCount--;
        } else {
            System.out.println("Train is empty.");
        }
    }
}
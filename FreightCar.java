class FreightCar extends Train {
    int weightCapacity;

    public FreightCar(int totalCapacity, int weightCapacity) {
        super(totalCapacity);
        this.weightCapacity = weightCapacity;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }
}
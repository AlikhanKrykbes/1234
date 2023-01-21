class Locomotive extends Train {
    int power;

    public Locomotive(int totalCapacity, int power) {
        super(totalCapacity);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
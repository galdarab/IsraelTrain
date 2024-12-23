class Train {
    private static int nextTrainId = 1;
    private int trainId;
    private Carriage[] carriages;

    public Train(int numCarriages) {
        this.trainId = nextTrainId++;
        this.carriages = new Carriage[numCarriages];
    }

    public void addCarriage(Carriage carriage, int index) {
        carriages[index] = carriage;
    }

    @Override
    public String toString() {
        return "Train ID: " + trainId + ", Carriages: " + carriages.length;
    }
}
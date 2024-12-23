class Trip {
    private String departureDate;
    private String departureTime;
    private String destination;
    private int estimatedTravelTime;
    private Train assignedTrain;

    public Trip(String departureDate, String departureTime, String destination, int estimatedTravelTime, Train assignedTrain) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.destination = destination;
        this.estimatedTravelTime = estimatedTravelTime;
        this.assignedTrain = assignedTrain;
    }
    public String toString() {
        return "Trip Details: " +
                "\nDeparture Date: " + departureDate +
                "\nDeparture Time: " + departureTime +
                "\nDestination: " + destination +
                "\nEstimated Travel Time: " + estimatedTravelTime + " minutes" +
                "\nAssigned Train: " + assignedTrain;
    }
}
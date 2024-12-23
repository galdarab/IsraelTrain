class Schedule {
    private static final int MAX_TRIPS = 1000; // הגבול למספר הנסיעות
    private Trip[] trips; // מערך של נסיעות
    private int numTrips; // מספר הנסיעות הנוכחי

    public Schedule() {
        this.trips = new Trip[MAX_TRIPS];
        this.numTrips = 0;
    }

    public void addTrip(Trip trip) {
        if (numTrips < MAX_TRIPS) {
            trips[numTrips] = trip;
            numTrips++;
        } else {
            System.out.println("לא ניתן להוסיף נסיעה חדשה, הלוח מלא");
        }
    }
    public int getNumTrips() {
        return numTrips;
    }

    public Trip getTrip(int index) {
        if (index >= 0 && index < numTrips) {
            return trips[index];
        }
        return null;
    }
}

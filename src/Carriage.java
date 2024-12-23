class Carriage {
    private static final int MAX_SEATS = 40;
    private int carriageNumber;
    private int seatsSold;

    public Carriage(int carriageNumber) {
        this.carriageNumber = carriageNumber;
        this.seatsSold = 0;
    }

    public boolean sellTickets(int numOfTickets) {
        if (seatsSold + numOfTickets <= MAX_SEATS) {
            seatsSold += numOfTickets;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carriage Number: " + carriageNumber + ", Seats Sold: " + seatsSold;
    }
}
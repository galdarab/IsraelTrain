
public class Main {
    public static void main(String[] args) {
        // יצירת רכבת עם 2 קרונות
        Train train = new Train(2);
        train.addCarriage(new Carriage(1), 0);
        train.addCarriage(new Carriage(2), 1);
        System.out.println("Train created: " + train);

        // יצירת נסיעה
        Trip trip = new Trip("2024-05-13", "08:00", "תל אביב - הרצליה", 30, train);
        System.out.println("Trip created: " + trip);

        // יצירת לוח זמנים והוספת נסיעה ללוח
        Schedule schedule = new Schedule();
        schedule.addTrip(trip);
        System.out.println("Trip added to schedule.");

        // בדיקת הלוח זמנים - הדפסת כל הנסיעות בלוח
        System.out.println("Schedule:");
        for (int i = 0; i < schedule.getNumTrips(); i++) {
            System.out.println(schedule.getTrip(i));
        }
    }
}
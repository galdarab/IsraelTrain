# Train and Trip Management System

This system is implemented in Java and is designed for managing trains, carriages, trips, and schedules. It allows the creation of trains with multiple carriages, adding trips to a schedule, selling tickets, and managing trips based on date, time, and destination.

## Key Features
- Creating a train with multiple carriages.
- Adding carriages to a train.
- Creating a trip that assigns a train with carriages to a specific journey.
- Creating a schedule that contains multiple trips.
- Adding trips to the schedule.
- Selling tickets for carriages (while ensuring seat limits are respected).
- Printing details of trains, carriages, and trips.

## Code Structure

### Main Classes:
1. **Carriage**:
   - Represents a train carriage.
   - Contains carriage number and the number of seats sold.
   - Supports selling tickets for seats.

2. **Train**:
   - Represents a train consisting of multiple carriages.
   - Allows adding carriages to the train.

3. **Trip**:
   - Represents a single trip with departure date, time, destination, estimated travel time, and an assigned train.

4. **Schedule**:
   - Represents a schedule containing multiple trips.
   - Supports adding trips to the schedule and printing all trips.

5. **Main**:
   - The main entry point that initializes the system.
   - Creates trains, carriages, trips, and a schedule.
   - Prints details of trains, carriages, trips, and the schedule.

## How to Run the System
1. Download the code to your computer.
2. Run the `Main.java` file.
3. The code will create a train with carriages, create a trip with the train, and add the trip to the schedule.
4. The system will print details of the trains, trips, and schedule.

## System Requirements:
- Java 8 or above.

## Running the Code:
To run the code, open the `Main.java` file and execute it in a Java-supported development environment.

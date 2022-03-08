package a6;

public class TrainingFlight extends Flight {

    public TrainingFlight(String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew) {
        super(flightNumber, dayOfWeek, departureTime, destination, numCrew);
    }

    @Override
    public String getFlightType() {
        return Common.TRAINING;
    }

    @Override
    public String toDisplayFormat() {
        return super.toDisplayFormat();
    }


} // end class TrainingFlight

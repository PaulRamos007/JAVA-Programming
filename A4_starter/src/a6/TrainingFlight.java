package a6;

public class TrainingFlight extends Flight {

    public TrainingFlight(String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew) {
        super(flightNumber, dayOfWeek, departureTime, destination, numCrew);
    }

    @Override
    public String toArchiveFormat() {
        return this.getFlightType() + super.toArchiveFormat(); 
    }
    
    @Override
    public String getFlightType() {
        return Common.TRAINING;
    }

    @Override
    public String toDisplayFormat() {
        return this.getFlightType() + super.toDisplayFormat() + "Total Weight: " + super.calculateWeight() + "\n";
    }


} // end class TrainingFlight

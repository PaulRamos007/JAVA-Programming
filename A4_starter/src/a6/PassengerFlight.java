package a6;

public class PassengerFlight extends Flight {

    private int numPassengers;

    public PassengerFlight(int numPassengers, String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew) {
        super(flightNumber, dayOfWeek, departureTime, destination, numCrew);
        this.numPassengers = numPassengers;
    }

    @Override
    public String getFlightType() {
        return Common.PASSENGER;
    }

    @Override
    public String toArchiveFormat() {
        return this.getFlightType() + super.toArchiveFormat() + "," + this.numPassengers; 
    }

    @Override
    public String toDisplayFormat() {
        return this.getFlightType() + super.toDisplayFormat() + "Passengers: "
                + this.numPassengers + "\n\tTotal Weight: " + this.calculateWeight() + "\n";
    }

    @Override
    public int calculateWeight() {
        return super.calculateWeight() + (this.numPassengers * Common.AVERAGE_PERSON_WEIGHT);
    }

} // end class PassengerFlight

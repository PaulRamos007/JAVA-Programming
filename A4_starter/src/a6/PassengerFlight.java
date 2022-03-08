package a6;

public class PassengerFlight extends Flight {

    private int numPassengers;

    public PassengerFlight(int numPassengers, String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew) {
        super(flightNumber, dayOfWeek, departureTime, destination, numCrew);
        this.numPassengers = numPassengers;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    @Override
    public String getFlightType() {
        return Common.PASSENGER;
    }

    @Override
    public String toArchiveFormat() {
        return getFlightType() + ","
                + getFlightNumber() + ","
                + getDayOfWeek() + ","
                + getDepartureTime() + ","
                + getDestination().getLocationCode() + ","
                + getNumCrew() + ","
                + getNumPassengers();
    }

    @Override
    public String toDisplayFormat() {
        return getFlightType() + " Flight = " + getFlightNumber() + ","
                + " Day = " + getDayOfWeek()
                + " Time = " + getDepartureTime()
                + "\n Destination: " + getDestination().toDisplayFormat()
                + "\n Number of Crew: " + getNumCrew()
                + "\n Number of Passengers: " + getNumPassengers()
                + "\n Total Weight: " + calculateWeight();
    }

    @Override
    public int calculateWeight() {
        return super.calculateWeight() + (getNumPassengers() * Common.AVERAGE_PERSON_WEIGHT);
    }

} // end class PassengerFlight

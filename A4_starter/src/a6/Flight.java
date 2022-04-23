package a6;

public abstract class Flight implements PolicyRules {

    private String flightNumber;
    private String dayOfWeek;
    private int departureTime;
    private Location destination;
    private int numCrew;

    public Flight(String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew) {
        this.flightNumber = flightNumber;
        this.dayOfWeek = dayOfWeek;
        this.departureTime = departureTime;
        this.destination = destination;
        this.numCrew = numCrew;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public Location getDestination() {
        return destination;
    }

    public int getNumCrew() {
        return numCrew;
    }

    public int calculateWeight() {
        return this.numCrew * Common.AVERAGE_PERSON_WEIGHT;
    }

    public String toDisplayFormat() {
        return " Flight = " + this.flightNumber + ","
                + this.destination.getLocationCode() + "("
                + this.destination.getCity() + ", " 
                + this.destination.getCountry() + "), Region " 
                + this.destination.getRegion() + "\n\t"
                + "Number of Crew: " + this.numCrew + "\n\t";
    }

    public String toArchiveFormat() {
        return "," + this.flightNumber + "," + this.dayOfWeek + "," + this.departureTime + "," 
                + this.destination.getLocationCode() + "," + this.numCrew;
    }

    public abstract String getFlightType();

    @Override
    public boolean checkCrew() {
        return this.getNumCrew() > Common.MINIMUM_CREW;
    }

    @Override
    public boolean checkPassengers() {
        return true;
    }

    @Override
    public boolean checkTime() {
        return true;
    }

    @Override
    public boolean checkWeight() {
        return this.calculateWeight() < Common.MAXIMUM_WEIGHT;
    }

} // end class Flight

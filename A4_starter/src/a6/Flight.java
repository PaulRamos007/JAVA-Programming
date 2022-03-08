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
        return dayOfWeek;
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
        return numCrew * Common.AVERAGE_PERSON_WEIGHT;
    }

    public String toDisplayFormat() {
        return getFlightType() + " Flight = " + getFlightNumber() + ","
                + " Day = " + getDayOfWeek()
                + " Time = " + getDepartureTime()
                + "\n Destination: " + getDestination().toDisplayFormat()
                + "\n Number of Crew: " + getNumCrew()
                + "\n Total Weight: " + calculateWeight();
    }

    public String toArchiveFormat() {
        return getFlightType() + ","
                + getFlightNumber() + ","
                + getDayOfWeek() + ","
                + getDepartureTime() + ","
                + getDestination().getLocationCode() + ","
                + getNumCrew() + ","
                + calculateWeight();
    }

    public abstract String getFlightType();

    @Override
    public boolean checkCrew() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkPassengers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

} // end class Flight

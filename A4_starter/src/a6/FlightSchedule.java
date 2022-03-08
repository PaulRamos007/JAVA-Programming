package a6;

public class FlightSchedule {

    private Flight[] flights;

    /**
     * Creates a new schedule based on the specified flights.
     *
     * @param flights the flights to be contained in this schedule
     */
    public FlightSchedule(Flight[] flights) {
        this.flights = flights;
    }

    /**
     * Gets all of the flights in this schedule.
     *
     * @return all of the flights in this schedule
     */
    public Flight[] getAllFlights() {
        return flights;
    }

    public Flight[] getFlightsByDestination(String locationCode) {
        return new Flight[0];
    }

    private int countFlightsByDestination(String locationCode) {
        return -1;
    }

    public Flight[] getFlightsByType(String flightType) {
        return new Flight[0];
    }

    private int countFlightsByType(String flightType) {
        return -1;
    }


} // end class FlightSchedule

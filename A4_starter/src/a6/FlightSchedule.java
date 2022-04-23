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
        Flight[] res = new Flight[countFlightsByDestination(locationCode)];
        int counter = 0;

        for (Flight flight : this.flights) {
            String location = flight.getDestination().getLocationCode();
            if (locationCode.equalsIgnoreCase(location)) {
                res[counter] = flight;
                counter++;
            }
        }
        return res;
    }

    private int countFlightsByDestination(String locationCode) {
        int res = 0;
        
        for (Flight flight : this.flights) {
            String location = flight.getDestination().getLocationCode();
            
            if (locationCode.equalsIgnoreCase(location)) {
                res ++;
            }
        }
        return res;
    }

    public Flight[] getFlightsByType(String flightType) {
        Flight[] res = new Flight[countFlightsByType(flightType)];
        int counter = 0;
        
        for (Flight flight : this.flights) {
            String type = flight.getFlightType();
            if (flightType.equalsIgnoreCase(type)) {
                res[counter] = flight;
                counter++;
            }
        }
        return res;
    }

    private int countFlightsByType(String flightType) {
        int res = 0;
        
        for (Flight flight : this.flights) {
            String type = flight.getFlightType();
            
            if (flightType.equalsIgnoreCase(type)) {
                res ++;
            }
        }
        return res;
    }

} // end class FlightSchedule

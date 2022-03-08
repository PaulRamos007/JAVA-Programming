package a6;

public class CargoFlight extends Flight {

    private int cargoWeight;

    public CargoFlight(int cargoWeight, String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew) {
        super(flightNumber, dayOfWeek, departureTime, destination, numCrew);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public String getFlightType() {
        return Common.CARGO;
    }

    @Override
    public String toArchiveFormat() {
        return super.toArchiveFormat();
    }

    @Override
    public String toDisplayFormat() {
        return getFlightType() + " Flight = " + getFlightNumber() + ","
                + " Day = " + getDayOfWeek()
                + " Time = " + getDepartureTime()
                + "\n Destination: " + getDestination().toDisplayFormat()
                + "\n Number of Crew: " + getNumCrew()
                + "\n Cargo Weight: " + getCargoWeight()
                + "\n Total Weight: " + calculateWeight();
    }

    @Override
    public int calculateWeight() {
        return super.calculateWeight() + getCargoWeight();
    }

} // end class CargoFlight

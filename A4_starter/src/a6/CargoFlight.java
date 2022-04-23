package a6;

public class CargoFlight extends Flight {

    private int cargoWeight;

    public CargoFlight(int cargoWeight, String flightNumber, String dayOfWeek, int departureTime, Location destination, int numCrew) {
        super(flightNumber, dayOfWeek, departureTime, destination, numCrew);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public String getFlightType() {
        return Common.CARGO;
    }

    @Override
    public String toArchiveFormat() {
        return this.getFlightType() + super.toArchiveFormat() + "," + this.cargoWeight;
    }

    @Override
    public String toDisplayFormat() {
        return this.getFlightType() + super.toDisplayFormat() 
                + "Cargo Weight: " + this.cargoWeight + "\n\tTotal Weight: "
                + this.calculateWeight() + "\n";
    }

    @Override
    public int calculateWeight() {
        return super.calculateWeight() + this.cargoWeight;
    }

} // end class CargoFlight

package a6;

/**
 * An airport location.
 */
public class Location {

    private String locationCode;
    private String city;
    private String country;
    private int region;

    /**
     * Creates a location with the specified parameters.
     *
     * @param locationCode a three-letter location code
     * @param city the name of a city
     * @param country the name of a country
     * @param region an integer representing a location region
     */
    public Location(String locationCode, String city, String country, int region) {
        this.locationCode = locationCode;
        this.city = city;
        this.country = country;
        this.region = region;
    }
    
    /**
     * Creates a string containing this location's information,
     * formatted for displaying to a human reader.
     *
     * @return the formatted information
     */
    public String toDisplayFormat() {
        return locationCode + " (" + city + ", " + country + "), region " + region;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public int getRegion() {
        return region;
    }
    
} // end class Location

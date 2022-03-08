package a6;

/**
 * Rules a flight must obey to conform to airline policy.
 */
public interface PolicyRules {

    /**
     * Does the flight have the required minimum number of crew members?
     *
     * @return <code>true</code> if the number of crew is acceptable
     */
    public boolean checkCrew();

    /**
     * Does the flight have the required minimum number of passengers?
     *
     * @return <code>true</code> if the number of passengers is acceptable
     */
    public boolean checkPassengers();

    /**
     * Does the flight have an acceptable departure time?
     * 
     * @return <code>true</code> if the departure time is acceptable
     */
    public boolean checkTime();
    
    /**
     * Does the flight have an acceptable total weight?
     * 
     * @return <code>true</code> if the total weight
     */
    public boolean checkWeight();
    
} // end interface PolicyRules

package a6;

//*** Not needed until Q4. ***//

/**
 * Methods to run data checks and create error reports.
 */
public class ErrorReporter {

    private static final String PREFIX = "    * ";

    private ErrorReporter() {} // No instantiation.

    /**
     * Checks each of the items to see if it satisfies the rules in the PolicyRules interface.
     * 
     * @param items the items to check
     * @return an array of messages - "OK" if all rules are met, or an error message.
     */
    public static String[] runPolicyChecks(PolicyRules[] items) {
        String[] res = new String[items.length];
        for (int i = 0; i <= items.length - 1; i++) {
            String tempErr = "";
            PolicyRules tempItem = items[i];

            if (!tempItem.checkTime()) {
                tempErr = PREFIX + "Time Violation";
            }

            if (!tempItem.checkWeight()) {
                if (tempErr.length() > 0) {
                    tempErr += "\n";
                }
                tempErr += PREFIX + "Weight Violation";
            }

            if (!tempItem.checkCrew()) {
                if (tempErr.length() > 0) {
                    tempErr += "\n";
                }
                tempErr += PREFIX + "Minimum Crew Violation";
            }

            if (!tempItem.checkPassengers()) {
                if (tempErr.length() > 0) {
                    tempErr += "\n";
                }
                tempErr += PREFIX + "Minimum Passenger Violation";
            }

            if (tempErr.length() == 0) {
                tempErr = Common.NO_ERROR;
            }
            res[i] = tempErr;
        }

        return res;
    }
} // end class ErrorReporter


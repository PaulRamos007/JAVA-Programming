package assignment5;

/**
 * A simple date consisting of year, month, and day.
 */
public class SimpleDate {

    private int year;
    private int month;
    private int day;

    /**
     * Constructs a new Date object if possible.
     *
     * @param year
     * @param month
     * @param day
     * @throws SimpleDateException if the year, month, or day is invalid
     */
    public SimpleDate(int year, int month, int day) throws SimpleDateException {
        if (year < 1) {
            throw new SimpleDateException("Invalid year: " + year);
        }
        if (month > 12 || month < 1) {
            throw new SimpleDateException("Invalid month: " + month);
        }
        if (day > 31 || day < 1 ) {
            throw new SimpleDateException("Invalid day: " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String format() {
        return year + "-" + month + "-" + day;
    }

} // end class SimpleDate

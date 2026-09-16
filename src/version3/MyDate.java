package version3;

public class MyDate {

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    private int date;
    private Month month;
    private int year;

    // Default Constructor
    public MyDate() {
        this.date = 1;
        this.month = Month.JANUARY;
        this.year = 2000;
    }

    // Full Constructor
    public MyDate(int date, Month month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date: " + date + " " + month + " " + year;
    }
}

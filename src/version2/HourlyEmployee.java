package version2;

public class HourlyEmployee {

    private int empID;
    private Name empName; // Utilizes the Name class object
    private float totalHoursWorked;
    private double ratePerHour;

    // Empty Constructor
    public HourlyEmployee() {
        this.empID = 0;
        // Instantiating the object first prevents NullPointerException
        this.empName = new Name();
        this.empName.setFirstName("N/A");
        this.empName.setMiddleName("N/A");
        this.empName.setLastName("N/A");

        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    // Partial Constructor (Accepts individual string components for Name)
    public HourlyEmployee(int empID, String firstName, String middleName, String lastName) {
        this.empID = empID;
        this.empName = new Name();
        this.empName.setFirstName(firstName);
        this.empName.setMiddleName(middleName);
        this.empName.setLastName(lastName);
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    // Full Constructor (Accepts a pre-built Name object)
    public HourlyEmployee(int empID, Name empName, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName; // Assigns the Name object reference directly
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    // Getter now returns the Name object
    public Name getEmpName() {
        return empName;
    }

    // Setter now accepts a Name object
    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {
        double regPay;
        if (totalHoursWorked > 40) {
            regPay = 40 * ratePerHour;
            double overHours = totalHoursWorked - 40;
            double overPay = (overHours * ratePerHour) * 1.5;
            regPay += overPay;
        } else {
            regPay = totalHoursWorked * ratePerHour;
        }
        return regPay;
    }

    public void displayHourlyEmployee() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(
                "HourlyEmployee [ID: %d, %s, Hours: %.2f, Rate: $%.2f, Total Salary: $%,.2f]",
                empID,
                empName, // This will automatically call your Name class's custom toString()
                totalHoursWorked,
                ratePerHour,
                computeSalary()
        );
    }
}

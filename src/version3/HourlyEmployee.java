package version3;

public class HourlyEmployee {

    private int empID;
    private Name empName;
    private MyDate empDate;
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        this.empID = 0;
        this.empName = new Name("N/A", "N/A", "N/A");
        this.empDate = new MyDate(1, MyDate.Month.JANUARY, 2000);
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, Name empName, MyDate empDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDate = empDate;
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, Name empName, MyDate empDate, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDate = empDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public MyDate getEmpDate() {
        return empDate;
    }

    public void setEmpDate(MyDate empDate) {
        this.empDate = empDate;
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
                "HourlyEmployee [ID: %d, Name: %s, %s, Hours: %.2f, Rate: ₱%,.2f, Total Salary: ₱%,.2f]",
                empID,
                empName,
                empDate,
                totalHoursWorked,
                ratePerHour,
                computeSalary()
        );
    }
}

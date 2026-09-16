package version3;

public class CommissionEmployee {

    private int empID;
    private Name empName;
    private MyDate empDate; // Integrated MyDate field
    private double totalSale;

    // Empty Constructor
    public CommissionEmployee() {
        this.empID = 0;
        this.empName = new Name("N/A", "N/A", "N/A");
        this.empDate = new MyDate(1, MyDate.Month.JANUARY, 2000); // Default date
        this.totalSale = 0;
    }

    // Partial Constructor
    public CommissionEmployee(int empID, Name empName, MyDate empDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDate = empDate;
        this.totalSale = 0;
    }

    // Full Constructor
    public CommissionEmployee(int empID, Name empName, MyDate empDate, double totalSale) {
        this.empID = empID;
        this.empName = empName;
        this.empDate = empDate;
        this.totalSale = totalSale;
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

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        if (totalSale >= 0) {
            this.totalSale = totalSale;
        }
    }

    public double computeSalary() {
        double commissionRate;

        if (totalSale < 50000) {
            commissionRate = 0.05;
        } else if (totalSale < 100000) {
            commissionRate = 0.10;
        } else if (totalSale < 500000) {
            commissionRate = 0.15;
        } else {
            commissionRate = 0.20;
        }

        return totalSale * commissionRate;
    }


    public void displayCommissionEmployee() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(
                "CommissionEmployee [ID: %d, Name: %s, %s, Total Sale: ₱%,.2f, Commission Salary: ₱%,.2f]",
                empID,
                empName,
                empDate,
                totalSale,
                computeSalary()
        );
    }
}

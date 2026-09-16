package version3;

public class BasePlusCommissionEmployee {

    private int empID;
    private Name empName;
    private MyDate empDate;
    private double totalSale;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        this.empID = 0;
        this.empName = new Name("N/A", "N/A", "N/A");
        this.empDate = new MyDate(1, MyDate.Month.JANUARY, 2000);
        this.totalSale = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate empDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDate = empDate;
        this.totalSale = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate empDate,
                                      double totalSale, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDate = empDate;
        this.totalSale = totalSale;
        this.baseSalary = baseSalary;
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
        this.totalSale = totalSale;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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

        double commission = totalSale * commissionRate;

        return baseSalary + commission;
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
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

        return String.format(
                "BasePlusCommissionEmployee [ID: %d, Name: %s, %s, Sales: ₱%,.2f, Base Salary: ₱%,.2f, Commission Rate: %.0f%%, Total Salary: ₱%,.2f]",
                empID,
                empName,
                empDate,
                totalSale,
                baseSalary,
                commissionRate * 100,
                computeSalary()
        );
    }
}

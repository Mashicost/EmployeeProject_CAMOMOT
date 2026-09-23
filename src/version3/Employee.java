package version3;

public class Employee {

    private int empID;
    private Name empName;
    private MyDate empDate;

    public Employee() {
        this.empID = 0;
        this.empName = new Name("N/A", "N/A", "N/A");
        this.empDate = new MyDate(1, MyDate.Month.JANUARY, 2000);
    }

    public Employee(int empID, Name empName, MyDate empDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDate = empDate;
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

    public double computeSalary() {
       return 0;
    }

    public void displayPieceWorkerEmployee() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName=" + empName +
                ", empDate=" + empDate +
                '}';
    }

}

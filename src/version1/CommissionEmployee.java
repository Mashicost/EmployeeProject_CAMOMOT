/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

public class CommissionEmployee {

    private int empID;
    private String empName;
    private double totalSale;

    // Empty Construct
    public CommissionEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalSale = 0;
    }

    // Partial Construct
    public CommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = 0;
    }

    // Full Construct
    public CommissionEmployee(int empID, String empName, double totalSale) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = totalSale;
    }

    // Getters and Setters
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        if (totalSale >= 0) {
            this.totalSale = totalSale;
        }
    }

    // Compute Salary
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

    // Display Employee
    public void displayCommissionEmployee() {
        System.out.println(this.toString());
    }

    // String Representation
    @Override
    public String toString() {
        return String.format(
                "CommissionEmployee [ID: %d, Name: %s, Total Sale: ₱%,.2f, Commission Salary: ₱%,.2f]",
                empID,
                empName,
                totalSale,
                computeSalary()
        );
    }
}

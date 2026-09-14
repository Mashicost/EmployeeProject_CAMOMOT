 /*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  */
 package version1;

 /**
  *
  * @author User
  */
 public class HourlyEmployee {

     private int empID;
     private String empName;
     private float totalHoursWorked;
     private double ratePerHour;

     //Empty Construct
     public HourlyEmployee() {
         this.empID = 0;
         this.empName = "N/A";
         this.totalHoursWorked = 0;
         this.ratePerHour = 0;
     }

     //Partial Construct
     public HourlyEmployee(int empID, String empName) {
         this.empID = empID;
         this.empName = empName;
         this.totalHoursWorked = 0;
         this.ratePerHour = 0;
     }

     //Full Construct
     public HourlyEmployee(int empID, String empName,
                           float totalHoursWorked, double ratePerHour) {
         this.empID = empID;
         this.empName = empName;
         this.totalHoursWorked = totalHoursWorked;
         this.ratePerHour = ratePerHour;
     }

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
                 "HourlyEmployee [ID: %d, Name: %s, Hours: %.2f, Rate: $%.2f, Total Salary: $%,.2f]",
                 empID,
                 empName,
                 totalHoursWorked,
                 ratePerHour,
                 computeSalary()
         );
     }

 }

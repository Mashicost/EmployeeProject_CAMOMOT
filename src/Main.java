import version2.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Empty Construct");
        HourlyEmployee emp1 = new HourlyEmployee();
        emp1.displayHourlyEmployee();

        System.out.println("\nPartial Construct");
        Name emp2Name = new Name("John", "Danger", "Doe");
        MyDate emp2Date = new MyDate(15, MyDate.Month.MARCH, 1995);
        HourlyEmployee emp2 = new HourlyEmployee(101, emp2Name, emp2Date);

        emp2.setTotalHoursWorked(45.0f);
        emp2.setRatePerHour(20.0);
        emp2.displayHourlyEmployee();

        System.out.println("\nFull Construct");
        Name bossName = new Name("Jane", "Marie", "Smith");
        MyDate bossDate = new MyDate(22, MyDate.Month.OCTOBER, 1988);

        HourlyEmployee emp3 = new HourlyEmployee(102, bossName, bossDate, 40.0f, 35.50);
        emp3.displayHourlyEmployee();

        System.out.println("\nCommission Employee Testing");
        Name commName = new Name("Alice", "Grace", "Brown");
        MyDate commDate = new MyDate(5, MyDate.Month.DECEMBER, 1992);
        CommissionEmployee emp4 = new CommissionEmployee(201, commName, commDate, 120000.00);
        emp4.displayCommissionEmployee();
    }
}

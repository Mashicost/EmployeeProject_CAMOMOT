import version2.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Empty Construct");
        HourlyEmployee emp1 = new HourlyEmployee();
        emp1.displayHourlyEmployee(); //Empty construct


        System.out.println("Partial Construct");

        HourlyEmployee emp2 = new HourlyEmployee(101, "John", "Danger", "Doe");

        emp2.setTotalHoursWorked(45.0f);
        emp2.setRatePerHour(20.0);
        emp2.displayHourlyEmployee();


        System.out.println("Full Construct");
        Name bossName = new Name();
        bossName.setFirstName("Jane");
        bossName.setMiddleName("Marie");
        bossName.setLastName("Smith");

        HourlyEmployee emp3 = new HourlyEmployee(102, bossName, 40.0f, 35.50);
        emp3.displayHourlyEmployee();
    }
}

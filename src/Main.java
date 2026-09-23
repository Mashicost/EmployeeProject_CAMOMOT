import version3.*;

public class Main {
    public static void main(String[] args) {

        // Empty Constructor
        PieceWorkerEmployee emp1 = new PieceWorkerEmployee();
        System.out.println(emp1);


        // Partial Constructor


        Name emp2Name = new Name("John", "Danger", "Doe");
        MyDate emp2Date = new MyDate(15, MyDate.Month.MARCH, 1995);

        PieceWorkerEmployee emp2 =
                new PieceWorkerEmployee(101, emp2Name, emp2Date);

        emp2.setTotalPiecesFinished(250);
        emp2.setRatePerPiece(20.0);

        System.out.println(emp2);

        // Full Constructor

        Name emp3Name = new Name("Jane", "Marie", "Smith");
        MyDate emp3Date = new MyDate(22, MyDate.Month.OCTOBER, 1988);

        PieceWorkerEmployee emp3 =
                new PieceWorkerEmployee(
                        102,
                        emp3Name,
                        emp3Date,
                        350,
                        25.50
                );

        System.out.println(emp3);


        // Getters and Setters
        emp3.setEmpID(999);
        emp3.setTotalPiecesFinished(500);
        emp3.setRatePerPiece(30.0);

        System.out.println(emp3);


        // Polymorphism
        Employee employee = emp3;

        System.out.println(employee);
        System.out.println("Salary: " + employee.computeSalary());
    }
}
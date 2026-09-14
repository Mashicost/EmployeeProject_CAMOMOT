/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import version1.*;

public class Main {

    public static void main(String[] args) {

        // Hourly Employee
        System.out.println("--- Hourly Employee Test ---");

        HourlyEmployee hourly1 = new HourlyEmployee();

        hourly1.setEmpID(101);
        hourly1.setEmpName("Alice Smith");
        hourly1.setTotalHoursWorked(45);
        hourly1.setRatePerHour(200);

        HourlyEmployee hourly2
                = new HourlyEmployee(102, "John Doe", 38, 200);

        System.out.println("[displayHourlyEmployee()]");
        hourly1.displayHourlyEmployee();
        hourly2.displayHourlyEmployee();

        System.out.println("\n[toString()]");
        System.out.println(hourly1);
        System.out.println(hourly2);

        // Piece Worker
        System.out.println("\n--- Piece Worker Employee Test ---");

        PieceWorkerEmployee piece1 = new PieceWorkerEmployee();

        piece1.setEmpID(201);
        piece1.setEmpName("Bob Jones");
        piece1.setTotalPiecesFinished(250);
        piece1.setRatePerPiece(15);

        PieceWorkerEmployee piece2
                = new PieceWorkerEmployee(202, "Sarah Lee", 350, 20);

        System.out.println("[displayPieceWorkerEmployee()]");
        piece1.displayPieceWorkerEmployee();
        piece2.displayPieceWorkerEmployee();

        System.out.println("\n[toString()]");
        System.out.println(piece1);
        System.out.println(piece2);

        System.out.println("\n--- Commission Employee Test ---");

        //Commission Employee
        CommissionEmployee commission1 = new CommissionEmployee();

        commission1.setEmpID(301);
        commission1.setEmpName("Charlie Brown");
        commission1.setTotalSale(200000);

        CommissionEmployee commission2
                = new CommissionEmployee(302, "Diana Reyes", 600000);

        System.out.println("[displayCommissionEmployee()]");
        commission1.displayCommissionEmployee();
        commission2.displayCommissionEmployee();

        System.out.println("\n[toString()]");
        System.out.println(commission1);
        System.out.println(commission2);

        System.out.println("\n--- Base Plus Commission Employee Test ---");

        BasePlusCommissionEmployee base1
                = new BasePlusCommissionEmployee();

        base1.setEmpID(401);
        base1.setEmpName("Mike Santos");
        base1.setTotalSale(200000);
        base1.setBaseSalary(10000);

        BasePlusCommissionEmployee base2
                = new BasePlusCommissionEmployee(
                402,
                "Anna Cruz",
                600000,
                15000
        );

        System.out.println("[displayBasePlusCommissionEmployee()]");
        base1.displayBasePlusCommissionEmployee();
        base2.displayBasePlusCommissionEmployee();

        System.out.println("\n[toString()]");
        System.out.println(base1);
        System.out.println(base2);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

public class PieceWorkerEmployee {

    private int empID;
    private String empName;
    private int totalPiecesFinished;
    private double ratePerPiece;

    // Empty Construct
    public PieceWorkerEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    // Partial Construct
    public PieceWorkerEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    // Full Construct
    public PieceWorkerEmployee(int empID, String empName,
                               int totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        if (totalPiecesFinished >= 0) {
            this.totalPiecesFinished = totalPiecesFinished;
        }
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        if (ratePerPiece >= 0) {
            this.ratePerPiece = ratePerPiece;
        }
    }

    public double computeSalary() {

        double basePay = totalPiecesFinished * ratePerPiece;

        int completeHundreds = totalPiecesFinished / 100;

        double bonusPay = completeHundreds * (10 * ratePerPiece);

        return basePay + bonusPay;
    }

    public void displayPieceWorkerEmployee() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(
                "PieceWorkerEmployee [ID: %d, Name: %s, Pieces: %d, Rate: ₱%.2f, Total Salary: ₱%,.2f]",
                empID,
                empName,
                totalPiecesFinished,
                ratePerPiece,
                computeSalary()
        );
    }
}

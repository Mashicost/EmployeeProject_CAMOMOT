package version2;

public class PieceWorkerEmployee {

    private int empID;
    private Name empName;
    private MyDate empDate;
    private int totalPiecesFinished;
    private double ratePerPiece;

    // Empty Construct
    public PieceWorkerEmployee() {
        this.empID = 0;
        this.empName = new Name("N/A", "N/A", "N/A");
        this.empDate = new MyDate(1, MyDate.Month.JANUARY, 2000);
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    // Partial Construct
    public PieceWorkerEmployee(int empID, Name empName, MyDate empDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDate = empDate;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    // Full Construct
    public PieceWorkerEmployee(int empID, Name empName, MyDate empDate,
                               int totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDate = empDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
                "PieceWorkerEmployee [ID: %d, Name: %s, %s, Pieces: %d, Rate: ₱%.2f, Total Salary: ₱%,.2f]",
                empID,
                empName,
                empDate,
                totalPiecesFinished,
                ratePerPiece,
                computeSalary()
        );
    }
}
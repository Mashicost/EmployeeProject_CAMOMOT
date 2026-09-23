package version3;

public class PieceWorkerEmployee extends Employee{

    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        super();
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate empDate) {
        super(empID, empName, empDate);

        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate empDate,
                               int totalPiecesFinished, double ratePerPiece) {
        super(empID, empName, empDate);

        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    @Override
    public double computeSalary() {
        double basePay = totalPiecesFinished * ratePerPiece;

        int completeHundreds = totalPiecesFinished / 100;

        double bonusPay = completeHundreds * (10 * ratePerPiece);

        return basePay + bonusPay;
    }

    public String toString() {
        return "PieceWorkerEmployee{" +
                super.toString() +
                "totalPiecesFinished=" + totalPiecesFinished +
                ", ratePerPiece=" + ratePerPiece + "salary=" + computeSalary() +
                '}';

    }



}

package LabWork02.Task01;

public class DivisionResult {
    public int iQuotient;
    public int iRemainder;
    public long lQuotient;
    public long lRemainder;

    public DivisionResult() {
        this.iQuotient = 0;
        this.iRemainder = 0;
        this.lQuotient = 0;
        this.lRemainder = 0;
    }

    public DivisionResult(int quotient, int remainder) {
        this.iQuotient = quotient;
        this.iRemainder = remainder;
    }

    public DivisionResult(long quotient, long remainder) {
        this.lQuotient = quotient;
        this.lRemainder = remainder;
    }
}
package ProblemSet_9a;

public enum VATRate {
    ZERO(0),
    LOW(5),
    STANDARD(20);
    private double rate = 0;

    VATRate(double rate) {
        this.rate = rate;
    }

    public double getPercentage() {
        return this.rate / 100;
    }
}

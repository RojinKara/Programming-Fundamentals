package ProblemSet_9c;

public class Charge {
    private Service service = null;
    private double charge = 0;

    public Charge(Service service, double charge)
            throws NullPointerException, IllegalArgumentException {
        super();
        if (service == null) {
            throw new NullPointerException("service is null");
        }
        if (charge < 1) {
            throw new IllegalArgumentException("charge too small");
        }
        this.service = service;
        this.charge = charge;
    }

    public double getCharge() {
        return this.charge;
    }

    public Service getService() {
        return this.service;
    }

    public double calculateVAT() {
        return this.charge * this.service.getRate().getPercentage();
    }
}

package ProblemSet_9b;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest {
    private String forename = null;
    private String surname = null;
    private String address = null;
    private String telephone = null;
    private List<Charge> charges = null;

    public Guest(String forename, String surname,
                 String address, String telephone) {
        super();
        this.charges = new ArrayList<Charge>();
        if (forename == null || surname == null
                || address == null || telephone == null) {
            throw new NullPointerException("input was null");
        }
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
    }

    @Override
    public void addCharge(Service s, double c) {
        this.charges.add(new Charge(s, c));
    }

    @Override
    public double calculateTotalChargeWithoutVAT() {
        double temp = 0;
        for (int i = 0; i < this.charges.size(); i++) {
            temp += this.charges.get(i).getCharge();
        }
        return temp;
    }

    @Override
    public double calculateVATChargeAtRate(VATRate r) {
        double temp = 0;
        for (int i = 0; i < this.charges.size(); i++) {
            if (this.charges.get(i).getService().getRate().equals(r)) {
                temp += this.charges.get(i).calculateVAT();
            }
        }
        return temp;
    }

    @Override
    public double calculateTotalChargeIncVat() {
        double temp = 0;
        for (int i = 0; i < this.charges.size(); i++) {
            temp += this.charges.get(i).getCharge()
                    + this.charges.get(i).calculateVAT();
        }
        return temp;
    }

    @Override
    public String toString() {
        return this.forename + " " + this.surname
                + ", " + this.address + ", " + this.telephone;
    }

    public String getForename() {
        return this.forename;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getAddress() {
        return this.address;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public List<Charge> getCharges() {
        return this.charges;
    }
}

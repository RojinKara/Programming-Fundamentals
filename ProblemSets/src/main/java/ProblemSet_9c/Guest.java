package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest {
    /**
     * Guest's forename.
     */
    private String forename = null;
    /**
     * Guest's surname.
     */
    private String surname = null;
    /**
     * Guest's address.
     */
    private String address = null;
    /**
     * Guest's telephone number.
     */
    private String telephone = null;
    /**
     * Guest's charges.
     */
    private List<Charge> charges = null;

    /**
     * Creates a Guest Object.
     *
     * @param forename
     * @param surname
     * @param address
     * @param telephone
     */

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

    /**
     * Adds new charge to the list.
     *
     * @param s service
     * @param c charge
     */

    @Override
    public void addCharge(Service s, double c) {
        this.charges.add(new Charge(s, c));
    }

    /**
     * Adds all the charges.
     *
     * @return total charges without VAT
     */

    @Override
    public double calculateTotalChargeWithoutVAT() {
        double temp = 0;
        for (int i = 0; i < this.charges.size(); i++) {
            temp += this.charges.get(i).getCharge();
        }
        return temp;
    }

    /**
     * Calculates total VAT at rate.
     *
     * @param r VATRate
     * @return VAT at rate
     */

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

    /**
     * Calculates total charge including VAT.
     *
     * @return all charge and VATs
     */

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

package ProblemSet_9c;

public interface IGuest {
    /**
     * Adds new charge to the list.
     *
     * @param s service
     * @param c charge
     */

    void addCharge(Service s, double c);

    /**
     * Adds all the charges.
     *
     * @return total charges without VAT
     */

    double calculateTotalChargeWithoutVAT();

    /**
     * Calculates total VAT at rate.
     *
     * @param r VATRate
     * @return VAT at rate
     */

    double calculateVATChargeAtRate(VATRate r);

    /**
     * Calculates total charge including VAT.
     *
     * @return all charge and VATs
     */

    double calculateTotalChargeIncVat();

    /**
     * Overrides toString.
     *
     * @return forename surname, address, telephone
     */
    String toString();
}

package ProblemSet_5b;

import java.util.regex.Pattern;

public class GasBill {
    private String accountNumber = null;
    private double amount = 0;
    private Customer customer = null;
    public GasBill(String accountNumber, double amount, Customer customer) {
        super();
        if (this.checkAccountAccuracy(accountNumber)) {
            this.accountNumber = accountNumber;
        }
        this.amount = amount;
        this.customer = customer;
    }
    public boolean checkAccountAccuracy(String accountNumber) {
        final Pattern pattern =
                Pattern.compile("G\\d{4}-\\d{4}-\\d{4}");
        if (!pattern.matcher(accountNumber).matches()) {
            this.accountNumber = "Invalid Account";
            return false;
        }
        return true;
    }
    public String displayAccountDetails() {
        return "Gas Bill\n" + " Account Number:"
                + this.accountNumber + "\n Customer:"
                + this.customer.toString()
                + "\n Amount due:£"
                + this.amount + "0";
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public String getCustomer() {
        return this.customer.toString();
    }
    public String displayAmountDue() {
        return "Amount due:£"
                + this.amount + "0";
    }
}

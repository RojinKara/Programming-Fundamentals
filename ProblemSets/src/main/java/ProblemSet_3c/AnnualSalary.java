package ProblemSet_3c;

public class AnnualSalary {
	private double salary = 0;
	private static final double PERSONAL_ALLOWANCE = 12570;
	private static final double TIER1 = 50270;
	private static final double TIER1_RATE = 0.2;
	private static final double TIER2 = 125140;
	private static final double TIER2_RATE = 0.4;
	private static final double TIER3_RATE = 0.45;
	public AnnualSalary() {
		super();
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double calculateTax() {
		double tax = 0;
		double copy = salary;
		if (copy > TIER2) {
			tax += (copy - TIER2) * TIER3_RATE;
			copy = TIER2;
		}
		if (copy > TIER1) {
			tax += (copy - TIER1) * TIER2_RATE;
			copy = TIER1;
		}
		if (copy > PERSONAL_ALLOWANCE) {
			tax += (copy - PERSONAL_ALLOWANCE) * TIER1_RATE;
		}
		return tax;
	}
}

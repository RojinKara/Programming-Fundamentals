package ProblemSet_3c;

public class AnnualSalary {
	private double salary;
	private static final double PERSONAL_ALLOWANCE = 12570;
	public AnnualSalary() { }
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double calculateTax() {
		double tax = 0;
		double copy = salary;
		if (copy > 125140) {
			tax += (copy - 125140) * 0.45;
			copy = 125140;
		}
		if (copy > 50270) {
			tax += (copy - 50270) * 0.40;
			copy = 50270;
		}
		if (copy > PERSONAL_ALLOWANCE) {
			tax += (copy - PERSONAL_ALLOWANCE) * 0.20;
		}
		return tax;
	}
}

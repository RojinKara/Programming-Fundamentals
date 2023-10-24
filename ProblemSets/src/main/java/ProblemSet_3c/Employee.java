package ProblemSet_3c;

public class Employee {
	private int id = 0;
	private String forename = null;
	private String surname = null;
	private AnnualSalary salary = null;
	private Position companyPosition = null;
	private static final double THRESHOLD = 40000;
	public Employee(int id, String forename, String surname,
			AnnualSalary salary, Position companyPosition) {
		super();
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.companyPosition = companyPosition;
	}
	public void displayEmployeeName() {
		System.out.println(this.forename + " " + this.surname);
	}
	private boolean eligibleForBonus() {
		if (this.salary.getSalary() > THRESHOLD) {
			return true;
		}
		return false;
	}
	public int getId() {
		return this.id;
	}
	public String getForename() {
		return this.forename;
	}
	public String getSurname() {
		return this.surname;
	}
	public double getSalary() {
		return this.salary.getSalary();
	}
	public String getPositionName() {
		return this.companyPosition.getRoleName();
	}
	@Override
	public String toString() {
		if (eligibleForBonus()) {
			return this.surname + ", " + this.forename
					+ " (" + this.id + "): "
					+ this.getPositionName()
					+ " at £" + this.getSalary()
					+ " (£" + this.salary.calculateTax()
					+ " tax) and is eligible for bonus.";
		}
		return this.surname + ", " + this.forename
				+ " (" + this.id + "): "
				+ this.getPositionName()
				+ " at £" + this.getSalary()
				+ " (£" + this.salary.calculateTax()
				+ " tax) and is not eligible for bonus.";
	}
}

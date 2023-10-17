package ProblemSet_3c;

public class Employee {
	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;
	public Employee(int id, String forename, String surname,
			AnnualSalary salary, Position companyPosition) {
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.companyPosition = companyPosition;
	}
	public void displayEmployeeName() {
		System.out.println(forename + " " + surname);
	}
	private boolean eligibleForBonus() {
		if (this.salary.getSalary() > 40000) {
			return true;
		}
		return false;
	}
	public int getId() {
		return id;
	}
	public String getForename() {
		return forename;
	}
	public String getSurname() {
		return surname;
	}
	public double getSalary() {
		return salary.getSalary();
	}
	public String getPositionName() {
		return companyPosition.getRoleName();
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

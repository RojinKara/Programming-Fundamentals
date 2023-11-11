package ProblemSet_8a;

public class Customer {
	private String name = null;
	private String surname = null;
	public Customer(String name, String surname)
			throws IllegalArgumentException {
		super();
		if (!validateInfo(name) || !validateInfo(surname)) {
			throw new IllegalArgumentException("Invalid");
		}
		this.name = name;
		this.surname = surname;
	}
	public char getName() {
		return this.name.charAt(0);
	}
	public String getSurname() {
		return this.surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public boolean validateInfo(String info) {
		return info.matches("[A-Z][a-z]*");
	}
	@Override
	public String toString() {
		return this.name.charAt(0) + ". " + this.surname;
	}
}

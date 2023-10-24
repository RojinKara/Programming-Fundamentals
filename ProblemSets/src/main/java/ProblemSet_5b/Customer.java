package ProblemSet_5b;

public class Customer {
	private String name = null;
	private String surname = null;
	public Customer(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	public char getName() {
		return this.name.charAt(0);
	}
	public String getSurname() {
		return this.surname;
	}
	@Override
	public String toString() {
		return this.getName() + ". " + this.getSurname();
	}
}

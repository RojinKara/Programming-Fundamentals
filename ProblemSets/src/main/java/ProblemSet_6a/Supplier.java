package ProblemSet_6a;

public class Supplier {
	private String name = null;
	private String phone = null;
	public Supplier(String name, String phone)
			throws IllegalArgumentException {
		super();
		if (!(phone.replace("-", "").matches("01483\\d{6}"))) {
			throw new IllegalArgumentException("Invalid");
		}
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	@Override
	public String toString() {
		return this.getName() + "("
		+ this.getPhone() + ")";
	}
}

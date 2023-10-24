package ProblemSet_5c;

public class Pizza {
	private String[] toppings = null;
	public Pizza() {
		super();
		this.toppings = new String[10];
	}
	public void addToppings(String[] toppings) {
		this.toppings = toppings;
	}
	public String printToppings() {
		String temp = "";
		temp += this.toppings[0];
		for (int i = 1; i < this.toppings.length; i++) {
			if (this.toppings[i] != null) {
				temp += "," + this.toppings[i];
			}
		}
		return temp;
	}
	public double calculateCost() {
		int temp = 0;
		for (int i = 0; i < this.toppings.length; i++) {
			if (this.toppings[i] != null) {
				temp++;
			}
		}
		switch (temp) {
		case 1:
			return 9.99;
		case 2:
			return 10.99;
		case 3:
			return 10.99;
		case 4:
			return 11.99;
		case 5:
			return 11.99;
		case 6:
			return 12.99;
		case 7:
			return 13.99;
		case 8:
			return 14.99;
		case 9:
			return 15.99;
		case 10:
			return 14.99;
		default:
			return 0;
		}
	}
}

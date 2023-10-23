package ProblemSet_5c;

import java.util.List;
import java.util.ArrayList;

public class Order {
	private List<Pizza> Pizzas;
	private Customer customer;
	public Order(Customer customer) {
		this.customer = customer;
		this.Pizzas = new ArrayList<Pizza>();
	}
	public void addPizza(Pizza pizza) {
		this.Pizzas.add(pizza);
	}
	public double calculateTotal() {
		double temp = 0;
		for (int i = 0; i < this.Pizzas.size(); i++) {
			temp += this.Pizzas.get(i).calculateCost();
		}
		return temp;
	}
	public String printReceipt() {
		return "Customer: " + this.customer.toString()
				+ "\n" + "Number of Pizzas: "
				+ this.howManyPizzasInOrder() + "\n"
				+ "Total Cost: " + this.calculateTotal();
	}
	public int howManyPizzasInOrder() {
		return this.Pizzas.size();
	}
}

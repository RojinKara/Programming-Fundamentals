package ProblemSet_2b;

public class Food {
		private String name;
		private double amountOfSugar;
		public Food(String name, double amountOfSugar) {
			this.amountOfSugar = amountOfSugar;
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public double getAmountOfSugar() {
			return amountOfSugar;
		}
}

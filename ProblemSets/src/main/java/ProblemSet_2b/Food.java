package ProblemSet_2b;

public class Food {
		private String name = null;
		private double amountOfSugar = 0;
		public Food(String name, double amountOfSugar) {
			super();
			this.amountOfSugar = amountOfSugar;
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
		public double getAmountOfSugar() {
			return this.amountOfSugar;
		}
}

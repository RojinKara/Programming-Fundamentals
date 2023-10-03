package ProblemSet_2b;

public class Meal {
	private Food mainCourse;
	private Food dessert;
	public Meal(Food mainCourse, Food dessert) {
		this.dessert = dessert;
		this.mainCourse = mainCourse;
	}
    	public double calculateTotalSugarLevel() {
    		return this.dessert.getAmountOfSugar()
    				+ this.mainCourse.getAmountOfSugar();
    	}   	
    	public String toString() {
    		return "Meal [mainCourse = " + this.mainCourse.getName()
    		+ ", dessert = " + this.dessert.getName() + "]"; 		
   	}
}

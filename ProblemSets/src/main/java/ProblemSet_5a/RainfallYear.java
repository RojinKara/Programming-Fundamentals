package ProblemSet_5a;

public class RainfallYear {
	private int year = 0;
	private double[] rainfallMonths;
	public RainfallYear(int year) {
		super();
		this.rainfallMonths = new double[12];
		this.year = year;
	}
	public int getYear() {
		return this.year;
	}
	public double calculateMeanRainfall() {
		double temp = 0;
		for (int i = 0; i < this.rainfallMonths.length; i++) {
			temp += this.rainfallMonths[i];
		}
		return temp / this.rainfallMonths.length;
	}
	public double calculateHighestRainfall() {
		double temp = 0;
		for (int i = 0; i < this.rainfallMonths.length; i++) {
			if (this.rainfallMonths[i] > temp) {
				temp = this.rainfallMonths[i];
			}
		}
		return temp;
	}
	public void enterData(double[] rainfall) {
		this.rainfallMonths = rainfall;
	}
	public double getRainfallMonth(String month) {
		switch (month) {
		case "JANUARY":
			return this.rainfallMonths[0];
		case "FEBRUARY":
			return this.rainfallMonths[1];
		case "MARCH":
			return this.rainfallMonths[2];
		case "APRIL":
			return this.rainfallMonths[3];
		case "MAY":
			return this.rainfallMonths[4];
		case "JUNE":
			return this.rainfallMonths[5];
		case "JULY":
			return this.rainfallMonths[6];
		case "AUGUST":
			return this.rainfallMonths[7];
		case "SEPTEMBER":
			return this.rainfallMonths[8];
		case "OCTOBER":
			return this.rainfallMonths[9];
		case "NOVEMBER":
			return this.rainfallMonths[10];
		case "DECEMBER":
			return this.rainfallMonths[11];
		default:
			return 0;
		}
	}
}

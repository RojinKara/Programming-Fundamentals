package ProblemSet_2c;

public class Module {
	private final String name = "COM1027";
	private Assessment assessment1;
	private Assessment assessment2;
	private Assessment assessment3;
	public Module(Assessment assessment1,
			Assessment assessment2,
			Assessment assessment3) {
		this.assessment1 = assessment1;
		this.assessment2 = assessment2;
		this.assessment3 = assessment3;
	}
	public double calculateAverage() {
		return assessment1.getMark() * 0.2
				+ assessment2.getMark() * 0.2
				+ assessment3.getMark() * 0.6;
	}
	public String toString() {
		return name + " (" + calculateAverage() + "%)";
	}
}

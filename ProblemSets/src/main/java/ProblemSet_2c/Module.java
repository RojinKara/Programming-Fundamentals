package ProblemSet_2c;

public class Module {
	private static final String NAME = "COM1027";
	private Assessment assessment1 = null;
	private Assessment assessment2 = null;
	private Assessment assessment3 = null;
	public Module(Assessment assessment1,
			Assessment assessment2,
			Assessment assessment3) {
		this.assessment1 = assessment1;
		this.assessment2 = assessment2;
		this.assessment3 = assessment3;
	}
	public double calculateAverage() {
		return this.assessment1.getMark() * 0.2
				+ this.assessment2.getMark() * 0.2
				+ this.assessment3.getMark() * 0.6;
	}
	public String toString() {
		return NAME + " (" + this.calculateAverage() + "%)";
	}
}

package ProblemSet_7a;

public class Module {
	private String name = null;
	public Module(String name) {
		if (name.matches("COM\\d{4}")) {
			this.name = name;
		} else {
			this.name = "Error";
		}
	}
	public String getName() {
		return this.name;
	}
}

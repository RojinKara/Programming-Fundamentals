package ProblemSet_4c;

public class Student {
	private char initial = 0;
	private String surname = null;
	private Module[] modules;
	public Student(char initial, String surname) {
		super();
		this.modules = new Module[8];
		this.initial = initial;
		this.surname = surname;
	}
	public int calculateYearAverage() {
		int temp = 0;
		for (int i = 0; i < this.modules.length; i++) {
			temp += this.modules[i].getAverage();
		}
		return temp / this.modules.length;
	}
	public Module getModules(int index) {
		return this.modules[index];
	}
	public void setModules(int index, String code,
			double average) {
		this.modules[index] = new Module(code, average);
	}
	public String getStudentDetails() {
		return this.initial + ". "
				+ this.surname + " "
				+ this.calculateYearAverage()
				+ "%";
	}
	public String displayArray() {
		String temp = "";
		for (int i = 0; i < this.modules.length; i++) {
			temp += this.modules[i].toString();
		}
		temp += "Year Average: "
		+ this.calculateYearAverage()
		+ "%";
		return temp;
	}
}

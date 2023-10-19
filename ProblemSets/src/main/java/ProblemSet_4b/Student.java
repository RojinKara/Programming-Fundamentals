package ProblemSet_4b;

public class Student {
	private char initial;
	private String surname;
	public Student(char initial, String surname) {
		this.initial = initial;
		this.surname = surname;
	}
	public String getStudentDetails() {
		return this.initial + ". " + this.surname;
	}
}

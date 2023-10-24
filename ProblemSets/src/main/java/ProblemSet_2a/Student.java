package ProblemSet_2a;

public class Student {
	private String forename = null;
	private String surname = null;
	private int age = 0;
	public Student(String forename, String surname, int age) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFullname() {
		return this.forename + " " + this.surname;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

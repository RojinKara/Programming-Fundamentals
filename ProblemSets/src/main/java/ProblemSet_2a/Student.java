package ProblemSet_2a;

public class Student {
	private String forename;
	private String surname;
	private int age;
	public Student(String forename, String surname, int age) {
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
		return forename + " " + surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

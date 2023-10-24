package ProblemSet_4b;

public class Classroom {
	private String room = null;
	private static final int CAPACITY = 20;
	private Student[] maxStudents;
	public Classroom(String room) {
		super();
		this.room = room;
		this.maxStudents = new Student[CAPACITY];
	}
	public String getRoom() {
		return this.room;
	}
	public static int getCapacity() {
		return CAPACITY;
	}
	public void addStudents(int index, char initial, String surname) {
		this.maxStudents[index] = new Student(initial, surname);
	}
	public String getSummary() {
		String temp = "";
		if (howManyStudents() == 0) {
			return "No students added";
		}
		for (int i = 0; i < this.maxStudents.length; i++) {
			if (this.maxStudents[i] != null) {
				temp += this.maxStudents[i].getStudentDetails()
						+ "\n";
			}
		}
		return temp;
	}
	public int howManyStudents() {
		int count = 0;
		for (int i = 0; i < this.maxStudents.length; i++) {
			if (this.maxStudents[i] != null) {
				count++;
			}
		}
		return count;
	}
}

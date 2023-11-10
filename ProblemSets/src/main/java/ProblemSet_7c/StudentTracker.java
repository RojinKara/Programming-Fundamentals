package ProblemSet_7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTracker {
	private List<Student> studentList = null;
	private Map<Integer, Student> moduleList = null;
	public StudentTracker() {
		this.studentList = new ArrayList<Student>();
		this.moduleList = new HashMap<Integer, Student>();
	}
	public void addStudent(Student student, List<Module> module) {
		for (int i = 0; i < module.size(); i++) {
			student.addModuleList(module.get(i));
		}
		this.studentList.add(student);
	}
	private void initialiseMap() {
		for(int i = 0; i < this.studentList.size(); i ++) {
			this.moduleList.put(this.studentList.get(i).getUrn(),
					this.studentList.get(i));
		}
	}
	public String printStudents() {
		StringBuilder print = new StringBuilder();
		for(int i = 0; i < this.studentList.size(); i++) {
		print.append(this.studentList.get(i).toString()).append("\n");
		}
		return print.toString();
	}
	public String printModules(int urn) {
		this.initialiseMap();
		if (moduleList.containsKey(urn)) {
			return "URN " + urn + " is enrolled in:\n"
			+this.moduleList.get(urn).printModules();
		}
		return "URN " + urn + " is enrolled in:\n nothing";
	}
}

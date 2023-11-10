package ProblemSet_7c;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name = null;
	private String urn = null;
	private List<Module> moduleList = null;
	public Student(String name, String urn)
			throws IllegalArgumentException {
		super();
		this.name = name;
		this.urn = urn;
		this.moduleList = new ArrayList<Module>();
		if (!name.matches("[A-Z][a-z]* [A-Z][a-z]*")) {
			throw
			new IllegalArgumentException("Invalid name");
		}
		if (!urn.matches("\\d{5}")) {
			this.urn = "00000";
		}
	}
	public int getUrn() {
		return Integer.parseInt(this.urn);
	}
	public String getName() {
		return this.name;
	}
	public void addModuleList(Module module) {
		if (!this.moduleList.contains(module) && module != null) {
			this.moduleList.add(module);
		}
	}
	public String printModules() {
		StringBuilder print =  new StringBuilder();
		for (int i = 0; i < moduleList.size(); i++) {
			print.append(this.moduleList.get(i).getName())
			.append(", ");
		}
		return print.toString().substring(0, print.length() - 2);
	}
	@Override
	public String toString() {
		return this.name + "(" + this.urn + ")";
	}
}

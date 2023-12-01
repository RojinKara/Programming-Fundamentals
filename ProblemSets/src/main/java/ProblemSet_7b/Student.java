package ProblemSet_7b;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name = null;
    private String urn = null;
    private List<Module> moduleList = null;

    public Student(String name, String urn)
            throws IllegalArgumentException {
        super();
        if (!name.matches("[A-Z][a-z]* [A-Z][a-z]*")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
        this.urn = urn;
        this.moduleList = new ArrayList<Module>();
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

    /**
     * Adds a module to the List.
     *
     * @param m Module
     */
    public void addModuleList(Module m) {
        if (!this.moduleList.contains(m) && m != null) {
            this.moduleList.add(m);
        }
    }

    public String printModules() {
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < moduleList.size(); i++) {
            print.append(this.moduleList.get(i).getName())
                    .append(", ");
        }
        return print.toString().substring(0, print.length() - 2);
    }
}

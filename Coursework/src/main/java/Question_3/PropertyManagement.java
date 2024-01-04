package Question_3;

import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
    private List<Property> properties = null;

    public PropertyManagement() {
        super();
        this.properties = new ArrayList<Property>();
    }

    public void addProperty(Property p)
            throws IllegalArgumentException, NullPointerException {
        if (p == null) {
            throw new NullPointerException("given house is null");
        }
        if (this.properties.contains(p)) {
            throw new IllegalArgumentException("House already added");
        }
        this.properties.add(p);
    }

    public void addTenant(Property p, Room r, ITenant t)
            throws NullPointerException, IllegalArgumentException {
        if (p == null || r == null || t == null) {
            throw new NullPointerException("something is null");
        }
        p.occupy(r, t);
    }

    public String displayInfographics() {
        int numOfStudents = 0;
        int numOfProfessionals = 0;
        int ageGroup1 = 0; // age group 17-25
        int ageGroup2 = 0; // age group 26-35
        int ageGroup3 = 0; // age group 36-49
        int ageGroup4 = 0; // age group 50-60
        int ageGroup5 = 0; // age group 60+
        for (int i = 0; i < this.properties.size(); i++) {
            for (int j = 0; j < this.properties.get(i)
                    .getTenants().size(); j++) {
                int age = this.properties.get(i).getTenants()
                        .get(j).getAge();
                TenantType type = this.properties.get(i)
                        .getTenants().get(j).getType();
                if (age - 25 <= 0) {
                    ageGroup1++;
                } else if (age - 35 <= 0) {
                    ageGroup2++;
                } else if (age - 49 <= 0) {
                    ageGroup3++;
                } else if (age - 60 <= 0) {
                    ageGroup4++;
                } else {
                    ageGroup5++;
                }
                if (type == TenantType.STUDENT) {
                    numOfStudents++;
                } else {
                    numOfProfessionals++;
                }
            }
        }
        return String.format("Confirmed Tenant Summary:\n17-25:%d"
                        + "\n26-35:%d\n36-49:%d\n50-60:%d\n60+:%d\n*****\n"
                        + "Professional:%d\nStudent:%d", ageGroup1, ageGroup2,
                ageGroup3, ageGroup4, ageGroup5,
                numOfProfessionals, numOfStudents);
    }

    public String displayProperties() {
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < this.properties.size(); i++) {
            if (this.properties.get(i).isAvailable()) {
                print.append(this.properties.get(i).toString()).append("\n");
            } else {
                print.append(this.properties.get(i).displayOccupiedProperty());
            }
        }
        return print.toString();
    }

    public String findProblematicProperty() {
        int highest = 0;
        int index = 0;
        boolean temp = false;
        for (int i = 0; i < this.properties.size(); i++) {
            if (this.properties.get(i).calculateImpact() > highest) {
                highest = this.properties.get(i).calculateImpact();
                index = i;
                temp = true;
            }
        }
        if (!temp) {
            return "no problematic properties";
        }
        return this.properties.get(index).toString();
    }

    public int numberOfPropertyType(String type) {
        int temp = 0;
        for (int i = 0; i < this.properties.size(); i++) {
            if (this.properties.get(i).getClass().getSimpleName()
                    .equalsIgnoreCase(type)) {
                temp++;
            }
        }
        return temp;
    }

    public double percentageCouncilTaxExemption() {
        double temp = 0;
        for (int i = 0; i < this.properties.size(); i++) {
            if (this.properties.get(i).councilTax == 0) {
                temp++;
            }
        }
        if (temp == 0) {
            return 0;
        }
        return (temp / this.properties.size()) * 100;
    }

    public void removeProperty(Property p)
            throws IllegalArgumentException, NullPointerException {
        if (p == null) {
            throw new NullPointerException("property is null");
        }
        if (!this.properties.contains(p)) {
            throw new IllegalArgumentException("doesnt exist");
        }
        this.properties.remove(p);
    }
}

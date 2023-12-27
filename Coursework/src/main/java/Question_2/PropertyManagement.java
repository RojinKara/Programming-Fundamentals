package Question_2;

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

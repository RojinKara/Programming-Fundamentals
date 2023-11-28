package Question_1;

import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
    private List<House> properties = null;

    public PropertyManagement() {
        super();
        this.properties = new ArrayList<House>();
    }

    public void addProperty(House p) throws IllegalArgumentException, NullPointerException {
        if (p == null) {
            throw new NullPointerException("given house is null");
        }
        if (this.properties.contains(p)) {
            throw new IllegalArgumentException("House already added");
        }
        this.properties.add(p);
    }

    public void addTenant(House p, Room r, ITenant t)
            throws NullPointerException, IllegalArgumentException {
        if (p == null || r == null || t == null) {
            throw new NullPointerException("something is null");
        }
        p.occupy(r, t);
    }

    public String displayProperties() {
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < this.properties.size(); i++) {
            print.append(this.properties.get(i).toString()).append("\n");
        }
        return print.toString();
    }

    public void removeProperty(House p) throws IllegalArgumentException, NullPointerException {
        if (p == null) {
            throw new NullPointerException("property is null");
        }
        if (!this.properties.contains(p)) {
            throw new IllegalArgumentException("doesnt exist");
        }
        this.properties.remove(p);
    }
}

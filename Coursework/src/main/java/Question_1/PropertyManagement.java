package Question_1;

import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {

    /**
     * Lists the houses in the properties.
     */
    private List<House> properties = null;

    /**
     * Property Management object is constructed.
     */
    public PropertyManagement() {
        super();
        this.properties = new ArrayList<House>();
    }

    /**
     * Adds a new property to houses.
     *
     * @param p property
     * @throws IllegalArgumentException if House is already added to properties.
     * @throws NullPointerException     if the house is null.
     */
    public void addProperty(House p)
            throws IllegalArgumentException, NullPointerException {
        if (p == null) {
            throw new NullPointerException("given house is null");
        }
        if (this.properties.contains(p)) {
            throw new IllegalArgumentException("House already added");
        }
        this.properties.add(p);
    }

    /**
     * Adds new tenants to houses.
     *
     * @param p property
     * @param r room
     * @param t tenant
     * @throws NullPointerException     if  house property or
     *                                  room or tenant is null.
     * @throws IllegalArgumentException if the room is
     *                                  already occupied by a tenant.
     */
    public void addTenant(House p, Room r, ITenant t)
            throws NullPointerException, IllegalArgumentException {
        if (p == null || r == null || t == null) {
            throw new NullPointerException("something is null");
        }
        p.occupy(r, t);
    }

    /**
     * Displays properties.
     *
     * @return properties in a specific format.
     */
    public String displayProperties() {
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < this.properties.size(); i++) {
            print.append(this.properties.get(i).toString()).append("\n");
        }
        return print.toString();
    }

    /**
     * Checks if the properties are valid. Removes them if they are not.
     *
     * @param p property.
     * @throws IllegalArgumentException if the property doesn't exist.
     * @throws NullPointerException     if the property is null.
     */
    public void removeProperty(House p)
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

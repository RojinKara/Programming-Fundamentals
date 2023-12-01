package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    /**
     * Hotel's name.
     */
    private String name = null;
    /**
     * Hotel's guests.
     */
    private List<IGuest> guests = null;

    /**
     * Creates a Hotel object.
     *
     * @param name
     */

    public Hotel(String name) {
        super();
        this.name = name;
        this.guests = new ArrayList<IGuest>();
    }

    /**
     * Adds guests to the guest list.
     *
     * @param guest
     */

    public void addGuest(IGuest guest) {
        this.guests.add(guest);
    }

    /**
     * Outputs the guest list.
     *
     * @return name Hotel Guest List
     */

    public String printGuestList() {
        StringBuilder temp = new StringBuilder(this.name
                + " Hotel\nGuest List\n");
        for (int i = 0; i < this.guests.size(); i++) {
            temp.append(this.guests.get(i).toString()).append("\n");
        }
        return temp.toString();
    }

    public List<IGuest> getGuests() {
        return this.guests;
    }

    public String getName() {
        return this.name;
    }
}

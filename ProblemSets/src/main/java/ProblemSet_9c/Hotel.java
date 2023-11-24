package ProblemSet_9c;

import org.checkerframework.framework.qual.DefaultQualifier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Hotel {
    private String name = null;
    private List<IGuest> guests = null;

    public Hotel(String name) {
        super();
        this.name = name;
        this.guests = new ArrayList<IGuest>();
    }

    public void addGuest(IGuest guest) {
        this.guests.add(guest);
    }

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

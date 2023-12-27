package Question_3;

import java.util.Map;

public class House extends Property {
    public House(int houseNumber, String street, String city,
                 String postCode, int numberOfRooms) {
        super(houseNumber, street, city, postCode, numberOfRooms);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Map.Entry<Room, ITenant> map : this.rooms.entrySet()) {
            total += map.getKey().getPrice();
        }
        return total;
    }

    @Override
    public boolean isAvailable() {
        return this.getAvailableRooms() > 0;
    }

    @Override
    public void occupy(Room r, ITenant t)
            throws NullPointerException, IllegalArgumentException {
        if (r == null || t == null) {
            throw new NullPointerException("things are null");
        }
        if (this.rooms.containsKey(r)) {
            throw new IllegalArgumentException("room is not available");
        }
        if (!this.isAvailable()) {
            throw new IllegalArgumentException("house is not available");
        }
        this.rooms.put(r, t);
    }

    @Override
    public String toString() {
        return super.toString() + " house :"
                + this.getAvailableRooms() + " available)";
    }

    @Override
    public String displayOccupiedProperty() {
        StringBuilder output = new StringBuilder(this.toString() + "\n");
        for (Map.Entry<Room, ITenant> map : this.rooms.entrySet()) {
            output.append("\tRoom: ")
                    .append(map.getKey().getPrice()).append("\n");
        }
        double total = this.getPrice() * 12;
        output.append("\tTotal: £").append(String.format("%.2f", total))
                .append(" (Council Tax: £")
                .append(this.councilTax).append(")\n");
        return output.toString();
    }
}

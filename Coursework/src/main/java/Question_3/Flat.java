package Question_3;

import java.util.Map;

public class Flat extends Property {
    private static final double MAINTENANCE_COSTS = 500;
    private int floor = 0;

    public Flat(int houseNumber, String street, String city,
                String postCode, int numberOfRooms, int floor) {
        super(houseNumber, street, city, postCode, numberOfRooms);
        this.floor = floor;
    }

    @Override
    public String toString() {
        int availableRooms = 0;
        if (this.isAvailable()) {
            availableRooms = this.getAvailableRooms();
        }
        return super.toString() + " flat on " + this.floor
                + " floor :" + availableRooms
                + " available)";
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
        return this.rooms.isEmpty();
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
            throw new IllegalArgumentException("flat is not available");
        }
        if (!t.getType().equals(TenantType.PROFESSIONAL)) {
            return;
        }
        this.rooms.put(r, t);
    }

    @Override
    public String displayOccupiedProperty() {
        StringBuilder output = new StringBuilder(this.toString() + "\n");
        for (Map.Entry<Room, ITenant> map : this.rooms.entrySet()) {
            output.append("\tRoom: ")
                    .append(map.getKey().getPrice()).append("\n");
        }
        double total = this.getPrice() * super.getNumberOfRooms() * 12
                + MAINTENANCE_COSTS;
        output.append("\tTotal: £").append(String.format("%.2f", total))
                .append(" (Council Tax: £")
                .append(this.councilTax).append(")\n");
        return output.toString();
    }
}

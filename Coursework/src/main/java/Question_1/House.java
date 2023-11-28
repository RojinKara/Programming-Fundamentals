package Question_1;

import java.util.HashMap;
import java.util.Map;

public class House {
    private int houseNumber = 0;
    private String street = null;
    private String city = null;
    private String postCode = null;
    private int numberOfRooms = 0;
    private Map<Room, ITenant> rooms = null;

    public House(int houseNumber, String street, String city,
                 String postCode, int numberOfRooms)
            throws IllegalArgumentException, NullPointerException {
        super();
        if (street == null || city == null || postCode == null) {
            throw new NullPointerException("something was null");
        }
        if (houseNumber < 1) {
            throw new IllegalArgumentException("invalid house number");
        }
        if (numberOfRooms < 1) {
            throw new IllegalArgumentException("invalid number of rooms");
        }
        if (!validateCity(city)) {
            throw new IllegalArgumentException("invalid city");
        }
        if (!validatePostCode(postCode)) {
            throw new IllegalArgumentException("invalid postcode");
        }
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.numberOfRooms = numberOfRooms;
        this.rooms = new HashMap<Room, ITenant>();
    }

    @Override
    public String toString() {
        return this.houseNumber + " " + this.street + ", "
                + this.city + " " + this.postCode + " ("
                + this.numberOfRooms + " bedroom house :" + this.getAvailableRooms() + " available)";
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.rooms.size();
    }

    //based on: https://sentry.io/answers/iterate-hashmap-java/
    public double getPrice() {
        double total = 0;
        for (Map.Entry<Room, ITenant> map : this.rooms.entrySet()) {
            total += map.getKey().getPrice();
        }
        return total;
    }

    public boolean isAvailable() {
        return this.getAvailableRooms() > 0;
    }

    public void occupy(Room r, ITenant t) {
        if (r == null || t == null) {
            throw new NullPointerException("things are null");
        }
        if (!this.isAvailable()) {
            throw new IllegalArgumentException("room is not available");
        }
        this.rooms.put(r, t);
    }

    private boolean validateCity(String input) {
        return input.matches("[A-Z][a-z]*");
    }

    private boolean validatePostCode(String input) {
        return input.replace(" ", "")
                .matches("GU\\d{2}[A-Z]{2}");
    }
}

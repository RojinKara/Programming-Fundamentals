package Question_2;

import java.util.HashMap;
import java.util.Map;

public abstract class Property {
    private int houseNumber = 0;
    private String street = null;
    private String city = null;
    private String postCode = null;
    private int numberOfRooms = 0;
    protected Map<Room, ITenant> rooms = null;

    protected double councilTax = 0;

    public Property(int houseNumber, String street, String city,
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
                + this.numberOfRooms + " bedroom";
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.rooms.size();
    }

    public void setCouncilTax(double tax) {
        int numberOfStudents = 0;
        int numberOfProfessionals = 0;
        double temp = 0;
        for (Map.Entry<Room, ITenant> entry : this.rooms.entrySet()) {
            if (entry.getValue().getType().equals(TenantType.STUDENT)) {
                numberOfStudents += 1;
            } else if (entry.getValue().getType().equals(TenantType.PROFESSIONAL)) {
                numberOfProfessionals += 1;
            }
        }
        if (numberOfProfessionals == 1) {
            temp = 0.75;
        } else if (numberOfStudents == 0) {
            temp = 1;
        }
        this.councilTax = councilTax * temp;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public abstract double getPrice();

    public abstract boolean isAvailable();

    public abstract void occupy(Room r, ITenant t);

    public abstract String displayOccupiedProperty();

    private boolean validateCity(String input) {
        return input.matches("[A-Z][a-z]*");
    }

    private boolean validatePostCode(String input) {
        return input.replace(" ", "")
                .matches("GU\\d{2}[A-Z]{2}");
    }
}

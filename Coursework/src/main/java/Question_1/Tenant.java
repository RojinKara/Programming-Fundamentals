package Question_1;

public class Tenant implements ITenant {
    private String forename = null;
    private String surname = null;
    private int age = 0;
    private TenantType type = null;

    public Tenant(String forename, String surname, int age, TenantType type)
            throws IllegalArgumentException, NullPointerException {
        super();
        if (forename == null || surname == null || type == null) {
            throw new NullPointerException("they are null");
        }
        if (!forename.matches("[A-Z][a-z]*")) {
            throw new IllegalArgumentException("forename invalid");
        }
        if (!surname.matches("[A-Z][a-z]*")) {
            throw new IllegalArgumentException("surname invalid");
        }
        if (age < 17) {
            throw new IllegalArgumentException("too young");
        }
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.type = type;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.forename + " " + this.surname;
    }

    @Override
    public TenantType getType() {
        return this.type;
    }
}

package ProblemSet_9c;

public class Service {
    private String code = null;
    private String name = null;
    private VATRate rate = null;

    /**
     * Creates a Service object.
     *
     * @param code
     * @param name
     * @param rate
     * @throws NullPointerException     if code or name or rate is null
     * @throws IllegalArgumentException if code doesn't match the given pattern
     */
    public Service(String code, String name, VATRate rate)
            throws NullPointerException, IllegalArgumentException {
        super();
        if (code == null || name == null || rate == null) {
            throw new NullPointerException("input was null");
        }
        if (!code.matches("[A-Z]{4}\\d{5}")) {
            throw new IllegalArgumentException("code is invalid");
        }
        this.code = code;
        this.name = name;
        this.rate = rate;
    }

    public String getCode() {
        return this.code;
    }

    public VATRate getRate() {
        return this.rate;
    }

    public String getName() {
        return this.name;
    }
}

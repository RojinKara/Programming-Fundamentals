package Question_1;

public interface ITenant {

    /**
     * Gets the age of the tenant.
     *
     * @return tenant's age
     */
    public abstract int getAge();

    /**
     * Gets the name of the tenant.
     *
     * @return tenant's full name.
     */
    public abstract String getName();

    /**
     * Gets type of the tenant.
     *
     * @return tenant's type as a professional or a student.
     */
    public abstract TenantType getType();
}

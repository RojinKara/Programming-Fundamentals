package Question_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TenantTest {

    @Test
    public void testNullArgument() {
        try {
            ITenant tenant = new Tenant("Alice", null, 18, TenantType.STUDENT);
            fail("Null Pointer Expected");
        } catch (NullPointerException e) {

        }

    }

    @Test
    public void testIllegalName() {
        try {
            ITenant tenant = new Tenant("alice", "Oseman", 18, TenantType.STUDENT);
            fail("Illegal argument expected");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testIllegalSurname() {
        try {
            ITenant tenant = new Tenant("Alice", "OseMan", 18, TenantType.STUDENT);
            fail("Illegal argument expected");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testIllegalAge() {
        try {
            ITenant tenant = new Tenant("Alice", "Oseman", 16, TenantType.STUDENT);
            fail("Illegal argument expected");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testValid() {
        ITenant tenant = new Tenant("Alice", "Oseman", 17, TenantType.STUDENT);
    }

    @Test
    public void testGetters() {
        ITenant tenant = new Tenant("Alice", "Oseman", 17, TenantType.STUDENT);
        assertEquals(17, tenant.getAge());
        assertEquals("Alice Oseman", tenant.getName());
        assertEquals(TenantType.STUDENT, tenant.getType());
    }
}

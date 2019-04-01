import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Alex McMillan", "JN1614C", 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Alex McMillan", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JN1614C", databaseAdmin.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(650.50);
        assertEquals(30650.50, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canReturnPayBonus(){
        assertEquals(databaseAdmin.getSalary()*0.01, databaseAdmin.payBonus(), 0.01);
    }

}

import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Matt Stokes", "JN1774C", 31500.00);
    }

    @Test
    public void hasName(){
        assertEquals("Matt Stokes", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JN1774C", developer.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(31500, developer.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(650.50);
        assertEquals(32150.50, developer.getSalary(), 0.001);
    }

    @Test
    public void canReturnPayBonus(){
        assertEquals(developer.getSalary()*0.01, developer.payBonus(), 0.01);
    }

}

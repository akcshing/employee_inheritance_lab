import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Stacey Thompson", "JN1003C", 41500.00, "Sales", 12000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Stacey Thompson", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JN1003C", director.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(41500, director.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(650.50);
        assertEquals(42150.50, director.getSalary(), 0.001);
    }

    @Test
    public void canReturnPayBonus(){
        assertEquals(director.getSalary()*0.02, director.payBonus(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(12000.00, director.getBudget(), 0.001);
    }
}

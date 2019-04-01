import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("James Clancy", "JN1203C", 32000.00, "Sales");
    }

    @Test
    public void hasName(){
        assertEquals("James Clancy", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JN1203C", manager.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(32000, manager.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(650.50);
        assertEquals(32650.50, manager.getSalary(), 0.001);
    }

    @Test
    public void canReturnPayBonus(){
        assertEquals(manager.getSalary()*0.01, manager.payBonus(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", manager.getDeptName());
    }
}

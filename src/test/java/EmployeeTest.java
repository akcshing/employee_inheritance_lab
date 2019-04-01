import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Alex Shing", "JNC11209", 27000);
    }

    @Test
    public void hasName(){
        assertEquals("Alex Shing", employee.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JNC11209", employee.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(27000, employee.getSalary());
    }

    
}

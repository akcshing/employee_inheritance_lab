//import Staff.Employee;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;

//public class EmployeeTest {

//    Employee employee;
//
//    @Before
//    public void before(){
//        employee = new Employee("Alex Shing", "JNC11209", 27000.00);
//    }
//
//    @Test
//    public void hasName(){
//        assertEquals("Alex Shing", employee.getName());
//    }
//
//    @Test
//    public void hasNINumber(){
//        assertEquals("JNC11209", employee.getNInumber());
//    }
//
//    @Test
//    public void hasSalary(){
//        assertEquals(27000, employee.getSalary(), 0.001);
//    }
//
//    @Test
//    public void canRaiseSalary(){
//        employee.raiseSalary(650.50);
//        assertEquals(27650.50, employee.getSalary(), 0.001);
//    }
//
//    @Test
//    public void canReturnPayBonus(){
//        assertEquals(employee.getSalary()*0.01, employee.payBonus(), 0.01);
//    }
//}
package milestone1.junit.employeeContain;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void testFindName(){
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("Javed");
        employees.add("Ashok");
        employees.add("Shivam");
        employees.add("Suraj");
        Employee employee = new Employee();
        assertEquals("FOUND",employee.findName(employees,"Javed"));
    }
}

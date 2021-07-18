package milestone2.collections.set.employeeSet;

import java.util.HashSet;
import java.util.Iterator;

class Employee{
    HashSet<String> employees = new HashSet<String>();

    HashSet<String> saveEmployee(String employeeName){
        employees.add(employeeName);
        return employees;
    }

    void printEmployee(){
      Iterator<String> i = employees.iterator();
      while(i.hasNext()){
          System.out.println(i.next());
      }

    }
}


public class TestEmployee {
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.saveEmployee("Javed Ali");
        employee.saveEmployee("Shivam Singh");
        employee.saveEmployee("Suraj Singh");
        employee.saveEmployee("Ashok");
        employee.printEmployee();
    }

}

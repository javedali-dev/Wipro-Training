package milestone1.collections.TestEmployee;

import java.util.ArrayList;

class Employee {
    int eCode;
    String Name;
    double salary;
    int age;

    public Employee(int eCode, String name, double salary, int age) {
        this.eCode = eCode;
        Name = name;
        this.salary = salary;
        this.age = age;
    }
}

class EmployeeDB{
    ArrayList<Employee> arrayOfEmployee;
    boolean addEmployee(Employee e){
        if(arrayOfEmployee.contains(e))
            return false;
        arrayOfEmployee.add(e);
        return true;

    }
    boolean deleteEmployee(int eCode){
        for (int i = 0; i <arrayOfEmployee.size() ; i++) {
            if(arrayOfEmployee.get(i).eCode==eCode){
                arrayOfEmployee.remove(i);
                return true;
            }
        }
        return false;
    }
     String showPaySlip(int eCode){
         for (int i = 0; i < arrayOfEmployee.size(); i++) {
            if(arrayOfEmployee.get(i).eCode==eCode){
                return "Employee salary:"+arrayOfEmployee.get(i).salary;
            }
         }
         return "There is no Employee with "+eCode;
     }
     Employee[] listAll(){
        Employee[] arr = new Employee[arrayOfEmployee.size()];
         for (int i = 0; i <arrayOfEmployee.size() ; i++) {
             arr[i] = arrayOfEmployee.get(i);
         }
         return arr;
     }


}

public class TestEmployee {
    public static void main(String[] args) {
        EmployeeDB employeeDB = new EmployeeDB();
        for (int i = 0; i <10 ; i++) {
            employeeDB.addEmployee(new Employee(i,"employee"+i,1000+i,25+i));
        }

    }
}

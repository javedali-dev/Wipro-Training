package milestone2.collections.fetchEmployee;

import java.util.ArrayList;

class Employee{
    int id;
    String name;
    String address;
    double salary;

    public Employee(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }


}


public class TestFetchEmployee {

    static Employee fetchEmployee(int id,ArrayList<Employee> arrayOfEmployee){
        for (int i = 0; i <arrayOfEmployee.size() ; i++) {
            if(id==arrayOfEmployee.get(i).id){
                return arrayOfEmployee.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Employee> arrayOfEmployee = new ArrayList<Employee>();
        for (int i = 0; i <10 ; i++) {
            arrayOfEmployee.add(new Employee(i,"emp"+i,"address"+i,45000+i*20));
        }
        System.out.println(fetchEmployee(2,arrayOfEmployee));
    }
}

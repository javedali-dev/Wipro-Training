package milestone1.oopsAndInheritance.Inheritance.Company;

public class Employee extends Person{
    double salary;
    int yearOfJoining;
    String insuranceNumber;

    public Employee(String name,double salary, int yearOfJoining, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", yearOfJoining=" + yearOfJoining +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

package milestone1.oopsAndInheritance.Inheritance.HighSchool;

public class Teacher extends Person {
    double salary;
    String subject;

    public Teacher(String name, int age, double salary, String subject) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;
    }
}

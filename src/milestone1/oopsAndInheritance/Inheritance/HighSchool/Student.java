package milestone1.oopsAndInheritance.Inheritance.HighSchool;

public class Student extends Person {
    String email;

    public Student(String name, int age, String email) {
        super(name, age);
        this.email = email;
    }
}

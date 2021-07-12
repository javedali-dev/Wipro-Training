package milestone1.oopsAndInheritance.Inheritance.HighSchool;

public class CollageStudent extends Student {
    int year;
    String major;

    public CollageStudent(String name, int age, String email, int year, String major) {
        super(name, age, email);
        this.year = year;
        this.major = major;
    }

    @Override
    public String toString() {
        return "CollageStudent{" +
                "year=" + year +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

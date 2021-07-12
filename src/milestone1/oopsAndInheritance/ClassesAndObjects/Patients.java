package milestone1.oopsAndInheritance.ClassesAndObjects;
class Patient{
    String name;
    double weight;
    double height;

    public Patient(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    double BMI(){
        return (weight/(height*height))*703;
    }

}

public class Patients {
    public static void main(String[] args) {
        Patient patient = new Patient("Javed",45,107);
        System.out.println("BMI:"+patient.BMI());
    }
}

package milestone1.oopsAndInheritance.Inheritance;



class Animal {
    void eat(){
        System.out.println("Animal eat");
    }
    void sleep(){
        System.out.println("Animal sleep");
    }
}
class Bird extends Animal{
    void eat(){
        System.out.println("Bird eat");
    }
    void sleep(){
        System.out.println("Bird sleep");
    }
    void fly(){
        System.out.println("Bird Fly");
    }
}
public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}

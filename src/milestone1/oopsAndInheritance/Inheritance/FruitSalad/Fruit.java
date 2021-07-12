package milestone1.oopsAndInheritance.Inheritance.FruitSalad;

public class Fruit {
    String name;
    String taste;
    char size;

    public Fruit(String name, String taste, char size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat(){
        System.out.println(name+" is "+taste+" in taste");
    }



}

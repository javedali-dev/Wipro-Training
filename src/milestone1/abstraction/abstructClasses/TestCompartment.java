package milestone1.abstraction.abstructClasses;

import java.util.Random;

abstract class Compartment{
    abstract void  notice();
}

class FirstClass extends Compartment{
    void notice(){
        System.out.println("First Class Notice");
    }
}
class Ladies extends Compartment{
    void notice(){
        System.out.println("Ladies Class Notice");
    }
}
class General extends Compartment{
    void notice(){
        System.out.println("General Class Notice");
    }
}
class Luggage extends Compartment{
    void notice(){
        System.out.println("Luggage Class Notice");
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] arrayOfCompartment = new Compartment[10];
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            int r = random.nextInt(4);
            switch (r+1){
                case 1:
                    Compartment firstclass = new FirstClass();
                    arrayOfCompartment[i] = firstclass;
                    break;
                case 2:
                    Compartment ladies = new Ladies();
                    arrayOfCompartment[i] = ladies;
                    break;
                case 3:
                    Compartment general = new General();
                    arrayOfCompartment[i] = general;
                    break;
                case 4:
                    Compartment luggage = new Luggage();
                    arrayOfCompartment[i] = luggage;
                    break;
            }
        }
        for (int i = 0; i <10 ; i++) {
            arrayOfCompartment[i].notice();
        }
    }
}

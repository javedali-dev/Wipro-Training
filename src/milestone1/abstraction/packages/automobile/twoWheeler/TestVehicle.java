package milestone1.abstraction.packages.automobile.twoWheeler;

import milestone1.abstraction.packages.automobile.fourWheeler.Ford;
import milestone1.abstraction.packages.automobile.fourWheeler.Logan;

public class TestVehicle {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Hero class");
        System.out.println("Model name:"+hero.getModelName());
        System.out.println("Registration number:"+hero.getRegistrationNumber());
        System.out.println("Owner Name:"+hero.getOwnerName());
        System.out.println("*******************************");
        System.out.println("Honda class");
        Honda honda = new Honda();
        System.out.println("Model name:"+honda.getModelName());
        System.out.println("Registration number:"+honda.getRegistrationNumber());
        System.out.println("Owner Name:"+honda.getOwnerName());
        System.out.println("*******************************");
        System.out.println("Logan class");
        Logan logan = new Logan();
        System.out.println("Model name:"+logan.getModelName());
        System.out.println("Registration number:"+logan.getRegistrationNumber());
        System.out.println("Owner Name:"+logan.getOwnerName());
        System.out.println("*******************************");
        System.out.println("Ford class");
        Ford ford = new Ford();
        System.out.println("Model name:"+ford.getModelName());
        System.out.println("Registration number:"+ford.getRegistrationNumber());
        System.out.println("Owner Name:"+ford.getOwnerName());
    }
}

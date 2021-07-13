package milestone1.abstraction.packages.automobile.fourWheeler;

import milestone1.abstraction.packages.automobile.Vehicle;

public class Ford extends Vehicle {

    public int speed(){
        return 80;
    }
    public void tempControl(){
        System.out.println("Setting temperature");
    }
    @Override
    public String getModelName() {
        return "Ford x456";
    }

    @Override
    public String getRegistrationNumber() {
        return "JA55664";
    }

    @Override
    public String getOwnerName() {
        return "Javed Ali";
    }
}

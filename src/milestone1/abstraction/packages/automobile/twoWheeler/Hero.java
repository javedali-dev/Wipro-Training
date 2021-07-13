package milestone1.abstraction.packages.automobile.twoWheeler;

import milestone1.abstraction.packages.automobile.Vehicle;

public class Hero extends Vehicle {
    public int getSpeed(){
        return 20;
    }
    public void radio(){
        System.out.println("Playing radio");
    }

    @Override
    public String getModelName() {
        return "Hero i789";
    }

    @Override
    public String getRegistrationNumber() {
        return "JA100235";
    }

    @Override
    public String getOwnerName() {
        return "Javed Ali";
    }
}



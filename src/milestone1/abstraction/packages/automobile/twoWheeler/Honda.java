package milestone1.abstraction.packages.automobile.twoWheeler;

import milestone1.abstraction.packages.automobile.Vehicle;

public class Honda extends Vehicle {

    public int getSpeed(){
        return 40;
    }
    public void cdPlayer(){
        System.out.println("Playing CD player");
    }

    @Override
    public String getModelName() {
        return "Honda i20";
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

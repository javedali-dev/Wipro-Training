package milestone1.abstraction.packages.automobile.fourWheeler;

import milestone1.abstraction.packages.automobile.Vehicle;

public class Logan extends Vehicle{
    public int speed(){
        return 20;
    }
    public void gps(){
        System.out.println("GPS turning on");
    }
    @Override
    public String getModelName() {
        return "Logan x123";
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

package milestone1.abstraction.packages.ship;

public class TestShip {
    public static void main(String[] args) {
        Compartment compartment = new Compartment();
        compartment.width = 2;
        compartment.height = 3;
        compartment.breadth= 4;
        System.out.println("Volume of Compartment:"+compartment.volume());
    }
}

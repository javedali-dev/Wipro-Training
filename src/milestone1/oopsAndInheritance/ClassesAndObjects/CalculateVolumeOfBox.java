/* Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, depth of double type). The class should have a method that can return volume.
Obtain an object and print the corresponding volume in main() function.
 */
package milestone1.oopsAndInheritance.ClassesAndObjects;


class Box{
    double width;
    double height;
    double depth;
    public Box(double width, double height,double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        return width*height*depth;
    }
}

public class CalculateVolumeOfBox {
    public static void main(String[] args) {
        Box box = new Box(12,13,14);
        System.out.println(box.volume());
    }


}

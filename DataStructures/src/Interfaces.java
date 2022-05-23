// An interface in java is an abstract type used to specify the behaviour of a class.
//A java interface contains static constants and abstract methods.
//interface in java is a mechanism to achieve abstraction. There can only be abstract methods in the java interface,
// not the method. It is used to achieve abstraction and multiple inheritance in java.
// The idea behind abstract and interface classes is that they create  the outline for the objects to be
// created from the class hence not object can be created without defining the methods of the class.
interface WaterBottleinterface {

    String color = "Blue";

    void fillUp();

    public class InterfaceExample implements WaterBottleinterface{

        public void fillUp(){
            System.out.println("filling out the water");
        }

        public static void main(String[] args) {

            System.out.println(color);
            InterfaceExample ex = new InterfaceExample();
            ex.fillUp();
        }
    }

}

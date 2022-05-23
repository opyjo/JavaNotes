

package methodOverriding;


//Why do we need method overriding? we may need method overriding when we need specific implementation
// of the subclass
public class Vehicle {

    void run(){
        System.out.println("Vehicle is running");
    }

}

// The Bike class is not overriding the run method from the Parent class
class Bike extends Vehicle {

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.run();
    }
}

// The truck class is overriding the Vehicle class by providing another implementation of the run method.
class Truck extends Vehicle {

    void run(){
        System.out.println("Truck is running safely");
    }
    public static void main(String[] args) {
        Truck t1 = new Truck();
        t1.run();
    }
}




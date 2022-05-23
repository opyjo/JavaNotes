//https://www.w3resource.com/java-tutorial/inheritance-composition-relationship.php

// The concept of IS-A is totally based on inheritance, which can be of two types class inheritance or interface
//inheritance. We can easily identify the IS-A relationship. Wherever you see an extends keyword or implements
// keyword in a class declaration,then the class is said to have IS_A relationship

//Composition(HAS-A) simply mean the use of instance variables that are references to other objects.
// For example Toyota has Engine, or House has Bathroom.


class Car {
    // Methods implementation and class/Instance members
    private String color;
    private int maxSpeed;

    public void carInfo() {
        System.out.println("Car Color= " + color + " Max Speed= " + maxSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}

// Here Toyota uses Engine object start() method via composition. We can say that Toyota class HAS-A Engine.
class Toyota extends Car{
    //Toyota extends Car and thus inherits all methods from Car (except final and static)
    //Toyota can also define all its specific functionality
    public void ToyotaStartDemo(){
        Engine ToyotaEngine = new Engine();
        ToyotaEngine.start();
    }
}


class Engine {
    public void start(){
        System.out.println("Engine Started:");
    }
    public void stop(){
        System.out.println("Engine Stopped:");
    }
}

//comparing Composition and inheritance







































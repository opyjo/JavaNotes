abstract class Person {

    abstract void talk();

    public void eat(){
        System.out.println("People can eat");
    }
}

class Male extends Person {

    public void talk(){
        System.out.println("Yes People can talk");
    }
}

class FirstPerson {

    public static void main(String[] args) {
        Male man = new Male();
        man.talk();
        man.eat();
    }
}

//ABSTRACTION ANALOGY
// A practical example of abstraction can be motorbike brakes. We know what brake does. When we apply the brake,
// the motorbike will stop. However, the working of the brake is hidden from us.

// The major advantage of hiding the working of the brake is that now the manufacturer can implement brake differently
// for different motorbikes, however, what brake does will be the same.

abstract class MotorBike{
    abstract void brake();
}

class SportsBike extends MotorBike {
    //implementation of abstract method
    public void brake(){
        System.out.println("SportBike Brake");
    }
}

class MountainBike extends MotorBike {
    //Implementation of the abstract method
    public void brake(){
        System.out.println( "MountainBike Brake");
    }
}


class Mainn{
    public static void main(String[] args) {
        SportsBike s1 = new SportsBike();
        s1.brake();
        MountainBike m1 = new MountainBike();
        m1.brake();
    }
}



// The super keyword in java is used in subclasses to access superclass members(attributes, constructors and methods)
// There are 3 uses of the super keyword.
//1. To call methods of the superclass that is overridden in the subclass
//2. To access attributes of the superclass if both superclass and subclass have attributes with the same name
//3. To explicitly call superclass no-arg(default) or parameterized constructor from the subclass constructor.


package com.callingsuper;
//1. To call the methods of the superclass that is overridden in the subclass.
class Animal {

    // overridden method
    public void display(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {

    // overriding method
    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){
        display();
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printMessage();
    }
}

//In the above because the display() method was defined in both the classes, the method of subclass Dog overrides
// the method of superclass Animal. Hence, the display() of the subclass is called.
// what if the overridden method of the superclass has to be called?. We use super.display() if the overridden method
// of the superclass Animal needs to be called.

//1b. Super to call Superclass Method.

class Animal2 {

    // overridden method
    public void whatAmI(){
        System.out.println("I am an animal");
    }
}

class Cat extends Animal2 {

    // overriding method
    @Override
    public void whatAmI(){
        System.out.println("I am a cat");
    }

    public void printMessage2(){

        // this calls overriding method
        whatAmI();

        // this calls overridden method
        super.whatAmI();
    }
}

class Main1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.printMessage2();
    }
}


//2. To Access Attributes of the Superclass.

class Animal3 {
    protected String type="animal";
}

class Horse extends Animal3 {
    public String type="mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}

class Main3 {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.printType();
    }
}

//3. Use of super() to access superclass constructor
class Animal4 {

    // default or no-arg constructor of class Animal
    Animal4() {
        System.out.println("I am an animal");
    }
}

class Bird extends Animal4 {

    // default or no-arg constructor of class Dog
    Bird() {

        // calling default constructor of the superclass
        super();

        System.out.println("I am a bird");
    }
}

class Main4 {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
    }
}







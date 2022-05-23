// An interface is a fully abstract class. It includes a group of abstract methods(method without a body)
// To use an interface, other classes must implement it. We use the implements' keyword to implement an interface.

interface Polygon {
    void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon {

    // implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }
}

// create an interface
interface Language {
    void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language {

    // implementation of abstract method
    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}

class Mainn {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}
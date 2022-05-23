// data from classes hidden from outside world but only accessible only through its own methods.
// These methods allow us to control how the members can be changed.
// Encapsulation is to make sure that sensitive data is hidden from the user. To achieve this,
// we must:

//1. declare class variables/ attributes as private
//2. provide public get and set methods to access the value of a private variable.

public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

class Main{

    public static void main(String[] args) {
        // if we have access to the class members we can easily make changes to the class created
        // Person p1 = new Person();
        // p1.name = "James";

        Person p1 = new Person();
        p1.setName("John"); // set the value of the name variable to "John"
        System.out.println(p1.getName());
    }
}

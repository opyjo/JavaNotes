public class Animal {
    private String name;

    //constructor
    // Remember that constructors are used to assign values to the class variables
    // at the time of object creation,either explicitly done by the programmer or by java itself
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Main {
    public static void main(String[] args) {
        Animal Dog = new Animal("Billy");
        System.out.println(Dog.getName());
    }
}



// In java a constructor is a block of codes similar to the method. It is called when an instance of the class
// is created. At the time of calling a constructor, memory for the object is allocated in the memory.
//It is a special type of method which is used to initialize the object.
//Every time an object is created using the new() keyword, at least one constructor is called.
// It calls a default constructor if there is no constructor available in the class. In such a case, java compiler
// provides a default constructor by default.

// Constructor is called because it constructs the values at the time of object creation. It is not necessary to write
// a constructor for a class. It is because java compiler creates a default constructor of your class does not have any.

//There are 2 types of Constructors

//1. Default Constructor: A constructor is called default if it does not have any parameter.

package javaConstructor;

//Java Program to create and call a default constructor
class Bike1{
    //creating a default constructor
    Bike1(){
        System.out.println("Bike is created");
    }
    //main method

    public static void main(String args[]){
    //calling a default constructor
        Bike1 b=new Bike1();
    }
}





// The question then is what is the purpose of a default constructor?
// The default constructor is used to provide values to

// What is the difference between runtime and compile time?
// Compile time is the period when the programming code is converted to machine code while
//Runtime is the period of time when a program is running and generally occurs after compile time

// The exception hierarchy has two branches
//1. RuntimeException(unchecked exception): These exceptions are not checked at compile-time but run-time such as
        // improper use of an API - IllegalArgumentException
        // Null pointed access(missing the initialization of a variable) - NullpointerException
        // out-of-bounds array classes - ArrayIndexOutOfBoundsException
        // Dividing a number by 0 - ArithmeticException
// NOTE: if it is a runtime exception, it is your fault

//2. An IOException(checked exception): also known as checked exception. They are checked by the compiler
// at the compile time and the programmer is prompted to handle these exceptions. Examples are:
        // Trying to open a file that doesn't exist results in FileNotFoundException
        // Trying to read past the end of a file.


// An exception is an unexpected event that occurs during program execution.
// It affects the flow of the program instruction which can cause the program to terminate abnormally.
// When an exception occurs within a method, it creates an object. The object is called
// the exception object

//It contains information about the exception such as the name and the description of the exception
// and state of the program when the exception occurred.

//https://www.programiz.com/java-programming/exceptions: show the java Exception hierarchy

//1. TRY-CATCH ERROR
package com.opyjo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;

public class WorkingWithExceptions {

    public static void main(String[] args) {
        String brand = null;
        try {
            System.out.println(brand.length());
        } catch(Exception e) {
            System.out.println("brand was null" + e);
        }
    }
}
//using try,catch to catch the exception
//class TypesOfExceptions {
//    public static void main(String[] args) {
//        //checked exceptions
//
//        try{
//          FileInputStream inputStream = new FileInputStream("example.txt");
//        }catch (Exception e){
//            System.out.println("File is empty " + e);
//        }
//
//    }
//}

// 2. JAVA FINALLY BLOCK

class JavaFinally {
    public static void main(String[] args) {
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        // Finally, block is always executed no matter whether there is an exception or not.
        finally {
            System.out.println("This is the finally block");
        }
    }
}

// In the below example the finally block was used to close the PrintWriter.
class ListOfNumbers {

    // create an integer array
    private int[] list = {5, 6, 8, 9, 2};

    // method to write data from array to a file
    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");

            // creating a new file OutputFile.txt
            out = new PrintWriter(new FileWriter("OutputFile.txt"));

            // writing values from list array to Output.txt
            for (int i = 0; i < 4; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        }

        catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }

        finally {
            // checking if PrintWriter has been opened
            if (out != null) {
                System.out.println("Closing PrintWriter");
                // close PrintWriter
                out.close();
            }

            else {
                System.out.println("PrintWriter not open");
            }
        }

    }
}

class Main1 {
    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        list.writeList();
    }
}

// MULTIPLE CATCH BLOCKS

class AListOfNumbers {
    public int[] arr = new int[10];

    public void writeList() {

        try {
            int i = arr[9] / 0;
        }

        catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        }

        catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }

        catch ( ArithmeticException e3) {
            System.out.println("ArithmeticException=> " + e3.getMessage());
        }

    }
}

class Main2 {
    public static void main(String[] args) {
        AListOfNumbers list = new AListOfNumbers();
        list.writeList();
    }
}




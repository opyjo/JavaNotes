// set interface is present in java.util package and extends the collection interface
//it is an unordered collection of objects in which duplicate values cannot be stored.
// The interface contains the methods inherited from the collection interface and adds a feature
//that restricts the insertion of the duplicate element.


import java.nio.charset.CharacterCodingException;
import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {


    public static void main(String[] args) {
        Set<Character> myChar = new HashSet<>();
        myChar.add('A');
        myChar.add('A');
        myChar.add('B');
        myChar.add('C');
        myChar.add('D');
        myChar.add('E');

        for( char characters: myChar){
            System.out.println(characters);
        }
    }
}

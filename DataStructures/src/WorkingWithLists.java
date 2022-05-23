// Difference between Arrays and List. An array is a dynamically-created object. It serves as a container that holds
//the constant number of values of the same type. It has contiguous(next or together in sequence) memory location.
// Once an array is created, we cannot change its size

// Whereas,an ArrayList is a class of collection framework. We do not need to allocate the size

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(0, -1);
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers.size());
        for (Object number : numbers){
            System.out.println(number);
        }

        numbers.forEach( System.out::println);
    }
}

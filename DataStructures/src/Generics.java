

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List myNum = new ArrayList();
        myNum.add(1);
        myNum.add(2);


//        myNum.add("hello");
//        myNum.add(new Point(10,10));


        System.out.println(myNum);
        for (Object stuff: myNum){
            System.out.println(stuff);
        }

        myNum.forEach( System.out::println);
    }
}

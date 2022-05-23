import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("james"));
        queue.add(new Person("Jamila"));
        queue.add(new Person("Abu"));

        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);

    }

    static class Person {
        String name;
        Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

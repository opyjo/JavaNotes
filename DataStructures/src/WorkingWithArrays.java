import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        int [] num = { 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(num));


        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        for ( int number : num){
            System.out.println(number);
        }
    }
}

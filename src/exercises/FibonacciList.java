package exercises;

import java.util.ArrayList;

public class FibonacciList {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        fibonacci.add(2);
        fibonacci.add(3);
        fibonacci.add(5);
        fibonacci.add(8);

        for(Integer entry : fibonacci) {
            System.out.println(entry);
        }
    }
}

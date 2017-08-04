package exercises;

import java.util.ArrayList;

public class SumOfEvens {
    public static void main(String[] args) {
        int numbers[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        Integer sum = 0;

        for(int i : numbers) {
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);


    }
}

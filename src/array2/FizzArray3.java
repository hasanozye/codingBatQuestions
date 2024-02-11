package array2;

import java.util.Arrays;

public class FizzArray3 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzArray3(5, 10))); //[5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(fizzArray3(11, 18))); //[11, 12, 13, 14, 15, 16, 17]
        System.out.println(Arrays.toString(fizzArray3(1, 3))); // [1,2]

    }


    public static int[] fizzArray3(int start, int end) {

        int[] fin = new int[end - start];
        int count = 0;

        for (int i = start; i < end; i++) {

            fin[count] += i;
            count++;

        }

        return fin;

    }
}
